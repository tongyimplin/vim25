package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.TaskReasonAlarm;
import com.vmware.vim25.TaskReasonSchedule;
import com.vmware.vim25.TaskReasonSystem;
import com.vmware.vim25.TaskReasonUser;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskReason")
@XmlSeeAlso({TaskReasonAlarm.class, TaskReasonSystem.class, TaskReasonSchedule.class, TaskReasonUser.class})
public class TaskReason extends DynamicData {}
