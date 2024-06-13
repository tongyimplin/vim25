package com.vmware.vim25;

import com.vmware.vim25.VmBeingRelocatedEvent;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmRelocateFailedEvent;
import com.vmware.vim25.VmRelocatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmRelocateSpecEvent")
@XmlSeeAlso({VmRelocateFailedEvent.class, VmRelocatedEvent.class, VmBeingRelocatedEvent.class})
public class VmRelocateSpecEvent extends VmEvent {}
