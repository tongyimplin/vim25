package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmPowerOffOnIsolationEvent;
import com.vmware.vim25.VmShutdownOnIsolationEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPoweredOffEvent")
@XmlSeeAlso({VmShutdownOnIsolationEvent.class, VmPowerOffOnIsolationEvent.class})
public class VmPoweredOffEvent extends VmEvent {}
