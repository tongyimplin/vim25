package com.vmware.vim25;

import com.vmware.vim25.HostNotConnected;
import com.vmware.vim25.HostNotReachable;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommunication")
@XmlSeeAlso({HostNotConnected.class, HostNotReachable.class})
public class HostCommunication extends RuntimeFault {}
