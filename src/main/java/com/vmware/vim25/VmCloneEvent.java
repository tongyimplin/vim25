package com.vmware.vim25;

import com.vmware.vim25.VmBeingClonedEvent;
import com.vmware.vim25.VmBeingClonedNoFolderEvent;
import com.vmware.vim25.VmCloneFailedEvent;
import com.vmware.vim25.VmClonedEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmCloneEvent")
@XmlSeeAlso({VmClonedEvent.class, VmBeingClonedNoFolderEvent.class, VmCloneFailedEvent.class, VmBeingClonedEvent.class})
public class VmCloneEvent extends VmEvent {}
