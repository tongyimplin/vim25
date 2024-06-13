package com.vmware.vim25;

import com.vmware.vim25.ReplicationDiskConfigFault;
import com.vmware.vim25.ReplicationFault;
import com.vmware.vim25.ReplicationVmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationConfigFault")
@XmlSeeAlso({ReplicationVmConfigFault.class, ReplicationDiskConfigFault.class})
public class ReplicationConfigFault extends ReplicationFault {}
