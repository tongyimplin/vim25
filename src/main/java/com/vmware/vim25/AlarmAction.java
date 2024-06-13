package com.vmware.vim25;

import com.vmware.vim25.AlarmTriggeringAction;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GroupAlarmAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmAction")
@XmlSeeAlso({GroupAlarmAction.class, AlarmTriggeringAction.class})
public class AlarmAction extends DynamicData {}
