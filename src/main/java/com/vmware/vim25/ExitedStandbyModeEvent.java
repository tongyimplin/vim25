package com.vmware.vim25;

import com.vmware.vim25.DrsExitedStandbyModeEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExitedStandbyModeEvent")
@XmlSeeAlso({DrsExitedStandbyModeEvent.class})
public class ExitedStandbyModeEvent extends HostEvent {}
