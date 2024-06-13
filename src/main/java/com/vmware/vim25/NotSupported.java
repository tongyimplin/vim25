package com.vmware.vim25;

import com.vmware.vim25.HostAccessRestrictedToManagementServer;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupported")
@XmlSeeAlso({HostAccessRestrictedToManagementServer.class})
public class NotSupported extends RuntimeFault {}
