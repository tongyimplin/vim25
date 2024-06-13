package com.vmware.vim25;

import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.VMwareDVSTeamingHealthCheckConfig;
import com.vmware.vim25.VMwareDVSVlanMtuHealthCheckConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSHealthCheckConfig")
@XmlSeeAlso({VMwareDVSTeamingHealthCheckConfig.class, VMwareDVSVlanMtuHealthCheckConfig.class})
public class VMwareDVSHealthCheckConfig extends DVSHealthCheckConfig {}
