package com.vmware.vim25;

import com.vmware.vim25.DrsEnteringStandbyModeEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnteringStandbyModeEvent")
@XmlSeeAlso({DrsEnteringStandbyModeEvent.class})
public class EnteringStandbyModeEvent extends HostEvent {}
