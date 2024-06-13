package com.vmware.vim25;

import com.vmware.vim25.DailyTaskScheduler;
import com.vmware.vim25.MonthlyByDayTaskScheduler;
import com.vmware.vim25.MonthlyByWeekdayTaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyTaskScheduler")
@XmlSeeAlso({MonthlyByDayTaskScheduler.class, MonthlyByWeekdayTaskScheduler.class})
public class MonthlyTaskScheduler extends DailyTaskScheduler {}
