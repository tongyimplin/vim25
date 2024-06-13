package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupCreatedEvent;
import com.vmware.vim25.DVPortgroupDestroyedEvent;
import com.vmware.vim25.DVPortgroupReconfiguredEvent;
import com.vmware.vim25.DVPortgroupRenamedEvent;
import com.vmware.vim25.DvpgImportEvent;
import com.vmware.vim25.DvpgRestoreEvent;
import com.vmware.vim25.Event;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupEvent")
@XmlSeeAlso({DVPortgroupDestroyedEvent.class, DvpgImportEvent.class, DVPortgroupCreatedEvent.class, DVPortgroupReconfiguredEvent.class, DvpgRestoreEvent.class, DVPortgroupRenamedEvent.class})
public class DVPortgroupEvent extends Event {}
