package com.vmware.vim25;

import com.vmware.vim25.ClusterComplianceCheckedEvent;
import com.vmware.vim25.ClusterCreatedEvent;
import com.vmware.vim25.ClusterDestroyedEvent;
import com.vmware.vim25.ClusterOvercommittedEvent;
import com.vmware.vim25.ClusterReconfiguredEvent;
import com.vmware.vim25.ClusterStatusChangedEvent;
import com.vmware.vim25.DasAdmissionControlDisabledEvent;
import com.vmware.vim25.DasAdmissionControlEnabledEvent;
import com.vmware.vim25.DasAgentFoundEvent;
import com.vmware.vim25.DasAgentUnavailableEvent;
import com.vmware.vim25.DasClusterIsolatedEvent;
import com.vmware.vim25.DasDisabledEvent;
import com.vmware.vim25.DasEnabledEvent;
import com.vmware.vim25.DasHostFailedEvent;
import com.vmware.vim25.DasHostIsolatedEvent;
import com.vmware.vim25.DrsDisabledEvent;
import com.vmware.vim25.DrsEnabledEvent;
import com.vmware.vim25.DrsInvocationFailedEvent;
import com.vmware.vim25.DrsRecoveredFromFailureEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.FailoverLevelRestored;
import com.vmware.vim25.HostMonitoringStateChangedEvent;
import com.vmware.vim25.InsufficientFailoverResourcesEvent;
import com.vmware.vim25.VmHealthMonitoringStateChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEvent")
@XmlSeeAlso({ClusterCreatedEvent.class, VmHealthMonitoringStateChangedEvent.class, DrsDisabledEvent.class, DasAgentUnavailableEvent.class, DrsRecoveredFromFailureEvent.class, ClusterDestroyedEvent.class, DrsEnabledEvent.class, DasAdmissionControlDisabledEvent.class, FailoverLevelRestored.class, DasDisabledEvent.class, DasHostFailedEvent.class, HostMonitoringStateChangedEvent.class, ClusterComplianceCheckedEvent.class, DasAdmissionControlEnabledEvent.class, ClusterReconfiguredEvent.class, DrsInvocationFailedEvent.class, DasClusterIsolatedEvent.class, DasEnabledEvent.class, InsufficientFailoverResourcesEvent.class, DasAgentFoundEvent.class, ClusterStatusChangedEvent.class, ClusterOvercommittedEvent.class, DasHostIsolatedEvent.class})
public class ClusterEvent extends Event {}
