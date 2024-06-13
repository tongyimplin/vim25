package com.vmware.vim25;

import com.vmware.vim25.DvsCreatedEvent;
import com.vmware.vim25.DvsDestroyedEvent;
import com.vmware.vim25.DvsHostBackInSyncEvent;
import com.vmware.vim25.DvsHostJoinedEvent;
import com.vmware.vim25.DvsHostLeftEvent;
import com.vmware.vim25.DvsHostStatusUpdated;
import com.vmware.vim25.DvsHostWentOutOfSyncEvent;
import com.vmware.vim25.DvsImportEvent;
import com.vmware.vim25.DvsMergedEvent;
import com.vmware.vim25.DvsPortBlockedEvent;
import com.vmware.vim25.DvsPortConnectedEvent;
import com.vmware.vim25.DvsPortCreatedEvent;
import com.vmware.vim25.DvsPortDeletedEvent;
import com.vmware.vim25.DvsPortDisconnectedEvent;
import com.vmware.vim25.DvsPortEnteredPassthruEvent;
import com.vmware.vim25.DvsPortExitedPassthruEvent;
import com.vmware.vim25.DvsPortJoinPortgroupEvent;
import com.vmware.vim25.DvsPortLeavePortgroupEvent;
import com.vmware.vim25.DvsPortLinkDownEvent;
import com.vmware.vim25.DvsPortLinkUpEvent;
import com.vmware.vim25.DvsPortReconfiguredEvent;
import com.vmware.vim25.DvsPortRuntimeChangeEvent;
import com.vmware.vim25.DvsPortUnblockedEvent;
import com.vmware.vim25.DvsPortVendorSpecificStateChangeEvent;
import com.vmware.vim25.DvsReconfiguredEvent;
import com.vmware.vim25.DvsRenamedEvent;
import com.vmware.vim25.DvsRestoreEvent;
import com.vmware.vim25.DvsUpgradeAvailableEvent;
import com.vmware.vim25.DvsUpgradeInProgressEvent;
import com.vmware.vim25.DvsUpgradeRejectedEvent;
import com.vmware.vim25.DvsUpgradedEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.HostLocalPortCreatedEvent;
import com.vmware.vim25.OutOfSyncDvsHost;
import com.vmware.vim25.RecoveryEvent;
import com.vmware.vim25.RollbackEvent;
import com.vmware.vim25.VmVnicPoolReservationViolationClearEvent;
import com.vmware.vim25.VmVnicPoolReservationViolationRaiseEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsEvent")
@XmlSeeAlso({RecoveryEvent.class, DvsPortDeletedEvent.class, DvsPortRuntimeChangeEvent.class, DvsUpgradeAvailableEvent.class, DvsUpgradedEvent.class, DvsPortLinkDownEvent.class, VmVnicPoolReservationViolationClearEvent.class, DvsCreatedEvent.class, DvsRenamedEvent.class, DvsHostLeftEvent.class, DvsPortCreatedEvent.class, DvsHostWentOutOfSyncEvent.class, VmVnicPoolReservationViolationRaiseEvent.class, DvsPortJoinPortgroupEvent.class, RollbackEvent.class, DvsPortLinkUpEvent.class, DvsUpgradeRejectedEvent.class, DvsPortConnectedEvent.class, HostLocalPortCreatedEvent.class, OutOfSyncDvsHost.class, DvsPortUnblockedEvent.class, DvsHostBackInSyncEvent.class, DvsPortExitedPassthruEvent.class, DvsImportEvent.class, DvsPortBlockedEvent.class, DvsRestoreEvent.class, DvsUpgradeInProgressEvent.class, DvsHostStatusUpdated.class, DvsPortLeavePortgroupEvent.class, DvsReconfiguredEvent.class, DvsPortDisconnectedEvent.class, DvsDestroyedEvent.class, DvsPortVendorSpecificStateChangeEvent.class, DvsHostJoinedEvent.class, DvsPortEnteredPassthruEvent.class, DvsPortReconfiguredEvent.class, DvsMergedEvent.class})
public class DvsEvent extends Event {}
