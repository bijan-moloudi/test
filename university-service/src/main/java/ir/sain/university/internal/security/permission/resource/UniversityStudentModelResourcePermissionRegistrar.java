package ir.sain.university.internal.security.permission.resource;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import ir.sain.university.constants.UniversityConstants;
import ir.sain.university.constants.UniversityWebPortletKeys;
import ir.sain.university.model.Student;
import ir.sain.university.service.StudentLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.WorkflowedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;

import java.util.Dictionary;

@Component(immediate = true)
public class UniversityStudentModelResourcePermissionRegistrar {

    @Activate
    public void activate(BundleContext bundleContext) {
        Dictionary<String, Object> properties = new HashMapDictionary<>();

        properties.put("model.class.name", Student.class.getName());

        _serviceRegistration = bundleContext.registerService(
                ModelResourcePermission.class,
                ModelResourcePermissionFactory.create(
                        Student.class, Student::getStudentId,
                        _studentLocalService::getStudent, _portletResourcePermission,
                        (modelResourcePermission, consumer) -> {
                            consumer.accept(
                                    new StagedModelPermissionLogic<>(
                                            _stagingPermission, UniversityWebPortletKeys.UNIVERSITYWEB,
                                            Student::getStudentId));
                            consumer.accept(
                                    new WorkflowedModelPermissionLogic<>(
                                            _workflowPermission, modelResourcePermission,
                                            _groupLocalService, Student::getStudentId));
                        }),
                properties);
    }

    @Deactivate
    public void deactivate() {
        _serviceRegistration.unregister();
    }

    @Reference
    private StudentLocalService _studentLocalService;

    @Reference(target = "(resource.name=" + UniversityConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission _portletResourcePermission;

    private ServiceRegistration<ModelResourcePermission> _serviceRegistration;

    @Reference
    private StagingPermission _stagingPermission;

    @Reference
    private WorkflowPermission _workflowPermission;

    @Reference
    private GroupLocalService _groupLocalService;
}
