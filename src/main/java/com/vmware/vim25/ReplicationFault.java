package com.vmware.vim25;

import com.vmware.vim25.IncompatibleHostForVmReplication;
import com.vmware.vim25.ReplicationConfigFault;
import com.vmware.vim25.ReplicationIncompatibleWithFT;
import com.vmware.vim25.ReplicationInvalidOptions;
import com.vmware.vim25.ReplicationNotSupportedOnHost;
import com.vmware.vim25.ReplicationVmFault;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationFault")
@XmlSeeAlso({ReplicationIncompatibleWithFT.class, ReplicationInvalidOptions.class, ReplicationVmFault.class, ReplicationNotSupportedOnHost.class, IncompatibleHostForVmReplication.class, ReplicationConfigFault.class})
public class ReplicationFault extends VimFault {}
