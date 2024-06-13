package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmUnsupportedStartingEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartingEvent")
@XmlSeeAlso({VmUnsupportedStartingEvent.class})
public class VmStartingEvent extends VmEvent {}
