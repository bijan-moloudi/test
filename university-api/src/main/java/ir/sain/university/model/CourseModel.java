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
 * The base model interface for the Course service. Represents a row in the &quot;UNV_Course&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>ir.sain.university.model.impl.CourseModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>ir.sain.university.model.impl.CourseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Course
 * @generated
 */
@ProviderType
public interface CourseModel
	extends BaseModel<Course>, GroupedModel, ShardedModel, StagedAuditedModel,
			WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a course model instance should use the {@link Course} interface instead.
	 */

	/**
	 * Returns the primary key of this course.
	 *
	 * @return the primary key of this course
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this course.
	 *
	 * @param primaryKey the primary key of this course
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this course.
	 *
	 * @return the uuid of this course
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this course.
	 *
	 * @param uuid the uuid of this course
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the course ID of this course.
	 *
	 * @return the course ID of this course
	 */
	public long getCourseId();

	/**
	 * Sets the course ID of this course.
	 *
	 * @param courseId the course ID of this course
	 */
	public void setCourseId(long courseId);

	/**
	 * Returns the group ID of this course.
	 *
	 * @return the group ID of this course
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this course.
	 *
	 * @param groupId the group ID of this course
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this course.
	 *
	 * @return the company ID of this course
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this course.
	 *
	 * @param companyId the company ID of this course
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this course.
	 *
	 * @return the user ID of this course
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this course.
	 *
	 * @param userId the user ID of this course
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this course.
	 *
	 * @return the user uuid of this course
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this course.
	 *
	 * @param userUuid the user uuid of this course
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this course.
	 *
	 * @return the user name of this course
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this course.
	 *
	 * @param userName the user name of this course
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this course.
	 *
	 * @return the create date of this course
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this course.
	 *
	 * @param createDate the create date of this course
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this course.
	 *
	 * @return the modified date of this course
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this course.
	 *
	 * @param modifiedDate the modified date of this course
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this course.
	 *
	 * @return the status of this course
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this course.
	 *
	 * @param status the status of this course
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this course.
	 *
	 * @return the status by user ID of this course
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this course.
	 *
	 * @param statusByUserId the status by user ID of this course
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this course.
	 *
	 * @return the status by user uuid of this course
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this course.
	 *
	 * @param statusByUserUuid the status by user uuid of this course
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this course.
	 *
	 * @return the status by user name of this course
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this course.
	 *
	 * @param statusByUserName the status by user name of this course
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this course.
	 *
	 * @return the status date of this course
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this course.
	 *
	 * @param statusDate the status date of this course
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the code of this course.
	 *
	 * @return the code of this course
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this course.
	 *
	 * @param code the code of this course
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this course.
	 *
	 * @return the name of this course
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this course.
	 *
	 * @param name the name of this course
	 */
	public void setName(String name);

	/**
	 * Returns the unit of this course.
	 *
	 * @return the unit of this course
	 */
	public int getUnit();

	/**
	 * Sets the unit of this course.
	 *
	 * @param unit the unit of this course
	 */
	public void setUnit(int unit);

	/**
	 * Returns the university ID of this course.
	 *
	 * @return the university ID of this course
	 */
	public long getUniversityId();

	/**
	 * Sets the university ID of this course.
	 *
	 * @param universityId the university ID of this course
	 */
	public void setUniversityId(long universityId);

	/**
	 * Returns <code>true</code> if this course is approved.
	 *
	 * @return <code>true</code> if this course is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this course is denied.
	 *
	 * @return <code>true</code> if this course is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this course is a draft.
	 *
	 * @return <code>true</code> if this course is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this course is expired.
	 *
	 * @return <code>true</code> if this course is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this course is inactive.
	 *
	 * @return <code>true</code> if this course is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this course is incomplete.
	 *
	 * @return <code>true</code> if this course is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this course is pending.
	 *
	 * @return <code>true</code> if this course is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this course is scheduled.
	 *
	 * @return <code>true</code> if this course is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}