package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostExtraNetworksEvent;
import com.vmware.vim25.HostIsolationIpPingFailedEvent;
import com.vmware.vim25.HostMissingNetworksEvent;
import com.vmware.vim25.HostNoAvailableNetworksEvent;
import com.vmware.vim25.HostNoHAEnabledPortGroupsEvent;
import com.vmware.vim25.HostNoRedundantManagementNetworkEvent;
import com.vmware.vim25.HostNotInClusterEvent;
import com.vmware.vim25.HostPrimaryAgentNotShortNameEvent;
import com.vmware.vim25.HostShortNameInconsistentEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDasEvent")
@XmlSeeAlso({HostNoAvailableNetworksEvent.class, HostMissingNetworksEvent.class, HostIsolationIpPingFailedEvent.class, HostPrimaryAgentNotShortNameEvent.class, HostNoRedundantManagementNetworkEvent.class, HostExtraNetworksEvent.class, HostNotInClusterEvent.class, HostNoHAEnabledPortGroupsEvent.class, HostShortNameInconsistentEvent.class})
public class HostDasEvent extends HostEvent {}
