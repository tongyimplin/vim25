package com.vmware.vim25;

import com.vmware.vim25.CustomizationEvent;
import com.vmware.vim25.DrsRuleComplianceEvent;
import com.vmware.vim25.DrsRuleViolationEvent;
import com.vmware.vim25.DrsSoftRuleViolationEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.MigrationEvent;
import com.vmware.vim25.NoMaintenanceModeDrsRecommendationForVM;
import com.vmware.vim25.NotEnoughResourcesToStartVmEvent;
import com.vmware.vim25.VmAcquiredMksTicketEvent;
import com.vmware.vim25.VmAcquiredTicketEvent;
import com.vmware.vim25.VmAutoRenameEvent;
import com.vmware.vim25.VmBeingCreatedEvent;
import com.vmware.vim25.VmBeingDeployedEvent;
import com.vmware.vim25.VmBeingHotMigratedEvent;
import com.vmware.vim25.VmBeingMigratedEvent;
import com.vmware.vim25.VmCloneEvent;
import com.vmware.vim25.VmConfigMissingEvent;
import com.vmware.vim25.VmConnectedEvent;
import com.vmware.vim25.VmCreatedEvent;
import com.vmware.vim25.VmDasBeingResetEvent;
import com.vmware.vim25.VmDasResetFailedEvent;
import com.vmware.vim25.VmDasUpdateErrorEvent;
import com.vmware.vim25.VmDasUpdateOkEvent;
import com.vmware.vim25.VmDateRolledBackEvent;
import com.vmware.vim25.VmDeployFailedEvent;
import com.vmware.vim25.VmDeployedEvent;
import com.vmware.vim25.VmDisconnectedEvent;
import com.vmware.vim25.VmDiscoveredEvent;
import com.vmware.vim25.VmDiskFailedEvent;
import com.vmware.vim25.VmEmigratingEvent;
import com.vmware.vim25.VmEndRecordingEvent;
import com.vmware.vim25.VmEndReplayingEvent;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmFailedMigrateEvent;
import com.vmware.vim25.VmFailedRelayoutEvent;
import com.vmware.vim25.VmFailedRelayoutOnVmfs2DatastoreEvent;
import com.vmware.vim25.VmFailedStartingSecondaryEvent;
import com.vmware.vim25.VmFailedToPowerOffEvent;
import com.vmware.vim25.VmFailedToPowerOnEvent;
import com.vmware.vim25.VmFailedToRebootGuestEvent;
import com.vmware.vim25.VmFailedToResetEvent;
import com.vmware.vim25.VmFailedToShutdownGuestEvent;
import com.vmware.vim25.VmFailedToStandbyGuestEvent;
import com.vmware.vim25.VmFailedToSuspendEvent;
import com.vmware.vim25.VmFailedUpdatingSecondaryConfig;
import com.vmware.vim25.VmFailoverFailed;
import com.vmware.vim25.VmFaultToleranceStateChangedEvent;
import com.vmware.vim25.VmFaultToleranceTurnedOffEvent;
import com.vmware.vim25.VmFaultToleranceVmTerminatedEvent;
import com.vmware.vim25.VmGuestOSCrashedEvent;
import com.vmware.vim25.VmGuestRebootEvent;
import com.vmware.vim25.VmGuestShutdownEvent;
import com.vmware.vim25.VmGuestStandbyEvent;
import com.vmware.vim25.VmInstanceUuidAssignedEvent;
import com.vmware.vim25.VmInstanceUuidChangedEvent;
import com.vmware.vim25.VmInstanceUuidConflictEvent;
import com.vmware.vim25.VmMacAssignedEvent;
import com.vmware.vim25.VmMacChangedEvent;
import com.vmware.vim25.VmMacConflictEvent;
import com.vmware.vim25.VmMaxFTRestartCountReached;
import com.vmware.vim25.VmMaxRestartCountReached;
import com.vmware.vim25.VmMessageErrorEvent;
import com.vmware.vim25.VmMessageEvent;
import com.vmware.vim25.VmMessageWarningEvent;
import com.vmware.vim25.VmMigratedEvent;
import com.vmware.vim25.VmNoCompatibleHostForSecondaryEvent;
import com.vmware.vim25.VmNoNetworkAccessEvent;
import com.vmware.vim25.VmOrphanedEvent;
import com.vmware.vim25.VmPoweredOffEvent;
import com.vmware.vim25.VmPoweredOnEvent;
import com.vmware.vim25.VmPoweringOnWithCustomizedDVPortEvent;
import com.vmware.vim25.VmPrimaryFailoverEvent;
import com.vmware.vim25.VmReconfiguredEvent;
import com.vmware.vim25.VmRegisteredEvent;
import com.vmware.vim25.VmRelayoutSuccessfulEvent;
import com.vmware.vim25.VmRelayoutUpToDateEvent;
import com.vmware.vim25.VmReloadFromPathEvent;
import com.vmware.vim25.VmReloadFromPathFailedEvent;
import com.vmware.vim25.VmRelocateSpecEvent;
import com.vmware.vim25.VmRemoteConsoleConnectedEvent;
import com.vmware.vim25.VmRemoteConsoleDisconnectedEvent;
import com.vmware.vim25.VmRemovedEvent;
import com.vmware.vim25.VmRenamedEvent;
import com.vmware.vim25.VmRequirementsExceedCurrentEVCModeEvent;
import com.vmware.vim25.VmResettingEvent;
import com.vmware.vim25.VmResourcePoolMovedEvent;
import com.vmware.vim25.VmResourceReallocatedEvent;
import com.vmware.vim25.VmResumingEvent;
import com.vmware.vim25.VmSecondaryAddedEvent;
import com.vmware.vim25.VmSecondaryDisabledBySystemEvent;
import com.vmware.vim25.VmSecondaryDisabledEvent;
import com.vmware.vim25.VmSecondaryEnabledEvent;
import com.vmware.vim25.VmSecondaryStartedEvent;
import com.vmware.vim25.VmStartRecordingEvent;
import com.vmware.vim25.VmStartReplayingEvent;
import com.vmware.vim25.VmStartingEvent;
import com.vmware.vim25.VmStartingSecondaryEvent;
import com.vmware.vim25.VmStaticMacConflictEvent;
import com.vmware.vim25.VmStoppingEvent;
import com.vmware.vim25.VmSuspendedEvent;
import com.vmware.vim25.VmSuspendingEvent;
import com.vmware.vim25.VmTimedoutStartingSecondaryEvent;
import com.vmware.vim25.VmUpgradeCompleteEvent;
import com.vmware.vim25.VmUpgradeFailedEvent;
import com.vmware.vim25.VmUpgradingEvent;
import com.vmware.vim25.VmUuidAssignedEvent;
import com.vmware.vim25.VmUuidChangedEvent;
import com.vmware.vim25.VmUuidConflictEvent;
import com.vmware.vim25.VmWwnAssignedEvent;
import com.vmware.vim25.VmWwnChangedEvent;
import com.vmware.vim25.VmWwnConflictEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmEvent", propOrder = {"template"})
@XmlSeeAlso({VmFailedRelayoutOnVmfs2DatastoreEvent.class, VmUpgradingEvent.class, VmSuspendedEvent.class, VmUuidConflictEvent.class, VmRenamedEvent.class, VmMaxRestartCountReached.class, VmDeployedEvent.class, VmResourceReallocatedEvent.class, VmFaultToleranceTurnedOffEvent.class, VmFailedToRebootGuestEvent.class, VmDisconnectedEvent.class, VmConfigMissingEvent.class, VmFailoverFailed.class, VmReloadFromPathFailedEvent.class, VmRequirementsExceedCurrentEVCModeEvent.class, VmRemoteConsoleConnectedEvent.class, VmDasBeingResetEvent.class, NotEnoughResourcesToStartVmEvent.class, VmFaultToleranceStateChangedEvent.class, VmAcquiredTicketEvent.class, VmUpgradeCompleteEvent.class, VmMaxFTRestartCountReached.class, VmFailedMigrateEvent.class, VmResettingEvent.class, VmInstanceUuidChangedEvent.class, VmRegisteredEvent.class, VmCreatedEvent.class, VmFailedToPowerOnEvent.class, VmMessageWarningEvent.class, VmResumingEvent.class, VmDasUpdateErrorEvent.class, VmAcquiredMksTicketEvent.class, VmStoppingEvent.class, VmEndRecordingEvent.class, VmEmigratingEvent.class, VmInstanceUuidAssignedEvent.class, VmSecondaryDisabledBySystemEvent.class, DrsRuleComplianceEvent.class, VmFailedToStandbyGuestEvent.class, VmUpgradeFailedEvent.class, VmDateRolledBackEvent.class, VmEndReplayingEvent.class, VmStartReplayingEvent.class, VmFailedStartingSecondaryEvent.class, VmBeingDeployedEvent.class, VmDiscoveredEvent.class, VmSecondaryEnabledEvent.class, VmPrimaryFailoverEvent.class, VmMessageErrorEvent.class, VmGuestStandbyEvent.class, VmTimedoutStartingSecondaryEvent.class, VmMacAssignedEvent.class, DrsRuleViolationEvent.class, VmSecondaryDisabledEvent.class, VmRelayoutUpToDateEvent.class, VmMacChangedEvent.class, VmResourcePoolMovedEvent.class, VmMigratedEvent.class, VmInstanceUuidConflictEvent.class, VmStaticMacConflictEvent.class, VmRelayoutSuccessfulEvent.class, VmUuidAssignedEvent.class, VmMacConflictEvent.class, VmAutoRenameEvent.class, VmStartRecordingEvent.class, VmDeployFailedEvent.class, VmFailedRelayoutEvent.class, VmNoCompatibleHostForSecondaryEvent.class, VmGuestOSCrashedEvent.class, VmPoweredOffEvent.class, VmBeingMigratedEvent.class, VmReloadFromPathEvent.class, VmUuidChangedEvent.class, VmRelocateSpecEvent.class, VmSecondaryAddedEvent.class, VmPoweringOnWithCustomizedDVPortEvent.class, VmFailedToSuspendEvent.class, VmBeingCreatedEvent.class, VmFailedUpdatingSecondaryConfig.class, VmCloneEvent.class, VmWwnConflictEvent.class, VmGuestShutdownEvent.class, VmMessageEvent.class, VmWwnAssignedEvent.class, VmDasUpdateOkEvent.class, VmDasResetFailedEvent.class, VmGuestRebootEvent.class, VmReconfiguredEvent.class, VmFailedToShutdownGuestEvent.class, VmFailedToResetEvent.class, VmSuspendingEvent.class, VmStartingSecondaryEvent.class, DrsSoftRuleViolationEvent.class, VmOrphanedEvent.class, VmFailedToPowerOffEvent.class, VmRemovedEvent.class, VmWwnChangedEvent.class, VmBeingHotMigratedEvent.class, VmPoweredOnEvent.class, VmFaultToleranceVmTerminatedEvent.class, VmRemoteConsoleDisconnectedEvent.class, VmSecondaryStartedEvent.class, NoMaintenanceModeDrsRecommendationForVM.class, MigrationEvent.class, VmDiskFailedEvent.class, CustomizationEvent.class, VmNoNetworkAccessEvent.class, VmConnectedEvent.class, VmStartingEvent.class})
public class VmEvent extends Event {
  protected boolean template;
  
  public boolean isTemplate() {
    return this.template;
  }
  
  public void setTemplate(boolean paramBoolean) {
    this.template = paramBoolean;
  }
}
