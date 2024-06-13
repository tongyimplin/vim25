package com.vmware.vim25;

import com.vmware.vim25.AndAlarmExpression;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventAlarmExpression;
import com.vmware.vim25.MetricAlarmExpression;
import com.vmware.vim25.OrAlarmExpression;
import com.vmware.vim25.StateAlarmExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmExpression")
@XmlSeeAlso({OrAlarmExpression.class, AndAlarmExpression.class, EventAlarmExpression.class, MetricAlarmExpression.class, StateAlarmExpression.class})
public class AlarmExpression extends DynamicData {}
