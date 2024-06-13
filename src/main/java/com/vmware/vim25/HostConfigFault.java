package com.vmware.vim25;

import com.vmware.vim25.AdminDisabled;
import com.vmware.vim25.AdminNotDisabled;
import com.vmware.vim25.BlockedByFirewall;
import com.vmware.vim25.ClockSkew;
import com.vmware.vim25.DisableAdminNotSupported;
import com.vmware.vim25.HostConfigFailed;
import com.vmware.vim25.HostInDomain;
import com.vmware.vim25.InvalidHostName;
import com.vmware.vim25.NasConfigFault;
import com.vmware.vim25.NoGateway;
import com.vmware.vim25.NoVirtualNic;
import com.vmware.vim25.PlatformConfigFault;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmfsMountFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigFault")
@XmlSeeAlso({BlockedByFirewall.class, HostInDomain.class, HostConfigFailed.class, AdminNotDisabled.class, NoVirtualNic.class, InvalidHostName.class, ClockSkew.class, PlatformConfigFault.class, NoGateway.class, DisableAdminNotSupported.class, NasConfigFault.class, VmfsMountFault.class, AdminDisabled.class})
public class HostConfigFault extends VimFault {}
