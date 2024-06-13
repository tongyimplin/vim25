package com.vmware.vim25;

import com.vmware.vim25.DatacenterCreatedEvent;
import com.vmware.vim25.DatacenterRenamedEvent;
import com.vmware.vim25.Event;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterEvent")
@XmlSeeAlso({DatacenterRenamedEvent.class, DatacenterCreatedEvent.class})
public class DatacenterEvent extends Event {}
