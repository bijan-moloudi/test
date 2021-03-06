/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ir.sain.university.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Student service. Represents a row in the &quot;UNV_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>ir.sain.university.model.impl.StudentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>ir.sain.university.model.impl.StudentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public interface StudentModel
	extends BaseModel<Student>, GroupedModel, ShardedModel, StagedAuditedModel,
			WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
	 */

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	public long getStudentId();

	/**
	 * Sets the student ID of this student.
	 *
	 * @param studentId the student ID of this student
	 */
	public void setStudentId(long studentId);

	/**
	 * Returns the group ID of this student.
	 *
	 * @return the group ID of this student
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this student.
	 *
	 * @param groupId the group ID of this student
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this student.
	 *
	 * @return the company ID of this student
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this student.
	 *
	 * @param companyId the company ID of this student
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this student.
	 *
	 * @return the user ID of this student
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this student.
	 *
	 * @param userId the user ID of this student
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this student.
	 *
	 * @return the user uuid of this student
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this student.
	 *
	 * @param userUuid the user uuid of this student
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this student.
	 *
	 * @return the user name of this student
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this student.
	 *
	 * @param userName the user name of this student
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this student.
	 *
	 * @return the create date of this student
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this student.
	 *
	 * @param createDate the create date of this student
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this student.
	 *
	 * @return the modified date of this student
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this student.
	 *
	 * @param modifiedDate the modified date of this student
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this student.
	 *
	 * @return the status of this student
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this student.
	 *
	 * @param status the status of this student
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this student.
	 *
	 * @return the status by user ID of this student
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this student.
	 *
	 * @param statusByUserId the status by user ID of this student
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this student.
	 *
	 * @return the status by user uuid of this student
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this student.
	 *
	 * @param statusByUserUuid the status by user uuid of this student
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this student.
	 *
	 * @return the status by user name of this student
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this student.
	 *
	 * @param statusByUserName the status by user name of this student
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this student.
	 *
	 * @return the status date of this student
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this student.
	 *
	 * @param statusDate the status date of this student
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the code of this student.
	 *
	 * @return the code of this student
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this student.
	 *
	 * @param code the code of this student
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this student.
	 *
	 * @param name the name of this student
	 */
	public void setName(String name);

	/**
	 * Returns the phone of this student.
	 *
	 * @return the phone of this student
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this student.
	 *
	 * @param phone the phone of this student
	 */
	public void setPhone(String phone);

	/**
	 * Returns the university ID of this student.
	 *
	 * @return the university ID of this student
	 */
	public long getUniversityId();

	/**
	 * Sets the university ID of this student.
	 *
	 * @param universityId the university ID of this student
	 */
	public void setUniversityId(long universityId);

	/**
	 * Returns <code>true</code> if this student is approved.
	 *
	 * @return <code>true</code> if this student is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this student is denied.
	 *
	 * @return <code>true</code> if this student is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this student is a draft.
	 *
	 * @return <code>true</code> if this student is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this student is expired.
	 *
	 * @return <code>true</code> if this student is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this student is inactive.
	 *
	 * @return <code>true</code> if this student is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this student is incomplete.
	 *
	 * @return <code>true</code> if this student is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this student is pending.
	 *
	 * @return <code>true</code> if this student is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this student is scheduled.
	 *
	 * @return <code>true</code> if this student is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}