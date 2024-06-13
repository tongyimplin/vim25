package com.vmware.vim25;

import com.vmware.vim25.EVCAdmissionFailed;
import com.vmware.vim25.NotSupportedHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHostInCluster")
@XmlSeeAlso({EVCAdmissionFailed.class})
public class NotSupportedHostInCluster extends NotSupportedHost {}
