package com.vmware.vim25;

import com.vmware.vim25.CreateTaskAction;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.MethodAction;
import com.vmware.vim25.RunScriptAction;
import com.vmware.vim25.SendEmailAction;
import com.vmware.vim25.SendSNMPAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action")
@XmlSeeAlso({SendEmailAction.class, CreateTaskAction.class, MethodAction.class, SendSNMPAction.class, RunScriptAction.class})
public class Action extends DynamicData {}
