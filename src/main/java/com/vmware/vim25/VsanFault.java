package com.vmware.vim25;

import com.vmware.vim25.CannotChangeVsanClusterUuid;
import com.vmware.vim25.CannotChangeVsanNodeUuid;
import com.vmware.vim25.CannotMoveVsanEnabledHost;
import com.vmware.vim25.CannotReconfigureVsanWhenHaEnabled;
import com.vmware.vim25.DuplicateVsanNetworkInterface;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VsanDiskFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanFault")
@XmlSeeAlso({DuplicateVsanNetworkInterface.class, CannotReconfigureVsanWhenHaEnabled.class, CannotChangeVsanClusterUuid.class, CannotChangeVsanNodeUuid.class, CannotMoveVsanEnabledHost.class, VsanDiskFault.class})
public class VsanFault extends VimFault {}
