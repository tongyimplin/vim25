package com.vmware.vim25;

import com.vmware.vim25.AgentInstallFailed;
import com.vmware.vim25.AlreadyBeingManaged;
import com.vmware.vim25.AlreadyConnected;
import com.vmware.vim25.CannotAddHostWithFTVmAsStandalone;
import com.vmware.vim25.CannotAddHostWithFTVmToDifferentCluster;
import com.vmware.vim25.CannotAddHostWithFTVmToNonHACluster;
import com.vmware.vim25.GatewayConnectFault;
import com.vmware.vim25.MultipleCertificatesVerifyFault;
import com.vmware.vim25.NoHost;
import com.vmware.vim25.NoPermissionOnHost;
import com.vmware.vim25.NotSupportedHost;
import com.vmware.vim25.ReadHostResourcePoolTreeFailed;
import com.vmware.vim25.SSLDisabledFault;
import com.vmware.vim25.SSLVerifyFault;
import com.vmware.vim25.TooManyHosts;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectFault")
@XmlSeeAlso({CannotAddHostWithFTVmToDifferentCluster.class, SSLVerifyFault.class, CannotAddHostWithFTVmAsStandalone.class, TooManyHosts.class, SSLDisabledFault.class, ReadHostResourcePoolTreeFailed.class, AlreadyConnected.class, CannotAddHostWithFTVmToNonHACluster.class, NoHost.class, AgentInstallFailed.class, MultipleCertificatesVerifyFault.class, AlreadyBeingManaged.class, GatewayConnectFault.class, NotSupportedHost.class, NoPermissionOnHost.class})
public class HostConnectFault extends VimFault {}
