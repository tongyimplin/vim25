package com.vmware.vim25;

import com.vmware.vim25.DrsVmPoweredOnEvent;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmRestartedOnAlternateHostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPoweredOnEvent")
@XmlSeeAlso({VmRestartedOnAlternateHostEvent.class, DrsVmPoweredOnEvent.class})
public class VmPoweredOnEvent extends VmEvent {}
