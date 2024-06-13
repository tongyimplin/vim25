package com.vmware.vim25;

import com.vmware.vim25.AffinityConfigured;
import com.vmware.vim25.CannotModifyConfigCpuRequirements;
import com.vmware.vim25.CannotMoveVmWithDeltaDisk;
import com.vmware.vim25.CannotMoveVmWithNativeDeltaDisk;
import com.vmware.vim25.CloneFromSnapshotNotSupported;
import com.vmware.vim25.DatacenterMismatch;
import com.vmware.vim25.DisallowedMigrationDeviceAttached;
import com.vmware.vim25.DiskMoveTypeNotSupported;
import com.vmware.vim25.FaultToleranceAntiAffinityViolated;
import com.vmware.vim25.FaultToleranceNeedsThickDisk;
import com.vmware.vim25.FaultToleranceNotSameBuild;
import com.vmware.vim25.HAErrorsAtDest;
import com.vmware.vim25.IncompatibleDefaultDevice;
import com.vmware.vim25.LargeRDMConversionNotSupported;
import com.vmware.vim25.MaintenanceModeFileMove;
import com.vmware.vim25.MigrationDisabled;
import com.vmware.vim25.MigrationFeatureNotSupported;
import com.vmware.vim25.MigrationNotReady;
import com.vmware.vim25.MismatchedNetworkPolicies;
import com.vmware.vim25.MismatchedVMotionNetworkNames;
import com.vmware.vim25.NetworksMayNotBeTheSame;
import com.vmware.vim25.NoGuestHeartbeat;
import com.vmware.vim25.RDMConversionNotSupported;
import com.vmware.vim25.RDMNotPreserved;
import com.vmware.vim25.ReadOnlyDisksWithLegacyDestination;
import com.vmware.vim25.SnapshotCopyNotSupported;
import com.vmware.vim25.SnapshotRevertIssue;
import com.vmware.vim25.SuspendedRelocateNotSupported;
import com.vmware.vim25.TooManyDisksOnLegacyHost;
import com.vmware.vim25.ToolsInstallationInProgress;
import com.vmware.vim25.UncommittedUndoableDisk;
import com.vmware.vim25.VMotionInterfaceIssue;
import com.vmware.vim25.VMotionProtocolIncompatible;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.WillLoseHAProtection;
import com.vmware.vim25.WillModifyConfigCpuRequirements;
import com.vmware.vim25.WillResetSnapshotDirectory;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationFault")
@XmlSeeAlso({WillModifyConfigCpuRequirements.class, CannotMoveVmWithDeltaDisk.class, LargeRDMConversionNotSupported.class, UncommittedUndoableDisk.class, RDMConversionNotSupported.class, MismatchedNetworkPolicies.class, ReadOnlyDisksWithLegacyDestination.class, DisallowedMigrationDeviceAttached.class, IncompatibleDefaultDevice.class, VMotionProtocolIncompatible.class, NoGuestHeartbeat.class, WillResetSnapshotDirectory.class, FaultToleranceAntiAffinityViolated.class, MaintenanceModeFileMove.class, RDMNotPreserved.class, TooManyDisksOnLegacyHost.class, MismatchedVMotionNetworkNames.class, ToolsInstallationInProgress.class, CloneFromSnapshotNotSupported.class, AffinityConfigured.class, CannotMoveVmWithNativeDeltaDisk.class, DatacenterMismatch.class, FaultToleranceNeedsThickDisk.class, FaultToleranceNotSameBuild.class, MigrationNotReady.class, MigrationFeatureNotSupported.class, NetworksMayNotBeTheSame.class, SuspendedRelocateNotSupported.class, SnapshotCopyNotSupported.class, WillLoseHAProtection.class, DiskMoveTypeNotSupported.class, CannotModifyConfigCpuRequirements.class, HAErrorsAtDest.class, VMotionInterfaceIssue.class, SnapshotRevertIssue.class, MigrationDisabled.class})
public class MigrationFault extends VimFault {}
