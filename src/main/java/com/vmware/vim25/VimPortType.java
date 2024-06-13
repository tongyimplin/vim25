package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryFaultFaultMsg;
import com.vmware.vim25.AlarmFilterSpec;
import com.vmware.vim25.AlarmSpec;
import com.vmware.vim25.AlarmState;
import com.vmware.vim25.AlreadyExistsFaultMsg;
import com.vmware.vim25.AlreadyUpgradedFaultMsg;
import com.vmware.vim25.AnswerFile;
import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.AnswerFileStatusResult;
import com.vmware.vim25.AnswerFileUpdateFailedFaultMsg;
import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.AuthMinimumAdminPermissionFaultMsg;
import com.vmware.vim25.BackupBlobWriteFailureFaultMsg;
import com.vmware.vim25.CannotAccessFileFaultMsg;
import com.vmware.vim25.CannotAccessLocalSourceFaultMsg;
import com.vmware.vim25.CannotCreateFileFaultMsg;
import com.vmware.vim25.ClusterComputeResourceHCIConfigSpec;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import com.vmware.vim25.ClusterConfigSpec;
import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.ClusterDasAdvancedRuntimeInfo;
import com.vmware.vim25.ClusterEnterMaintenanceResult;
import com.vmware.vim25.ClusterHostRecommendation;
import com.vmware.vim25.ClusterIoFilterInfo;
import com.vmware.vim25.ClusterProfileConfigSpec;
import com.vmware.vim25.ClusterResourceUsageSummary;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ComplianceResult;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.ConcurrentAccessFaultMsg;
import com.vmware.vim25.ConfigTarget;
import com.vmware.vim25.ConflictingConfigurationFaultMsg;
import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.CryptoKeyResult;
import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatus;
import com.vmware.vim25.CryptoManagerKmipServerCertInfo;
import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.CustomFieldDef;
import com.vmware.vim25.CustomizationFaultFaultMsg;
import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.CustomizationSpecItem;
import com.vmware.vim25.DVPortConfigSpec;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.DVSCapability;
import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.DVSCreateSpec;
import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.DVSManagerDvsConfigTarget;
import com.vmware.vim25.DVSNetworkResourcePoolConfigSpec;
import com.vmware.vim25.DasConfigFaultFaultMsg;
import com.vmware.vim25.DatabaseSizeEstimate;
import com.vmware.vim25.DatabaseSizeParam;
import com.vmware.vim25.DatacenterBasicConnectInfo;
import com.vmware.vim25.DatacenterConfigSpec;
import com.vmware.vim25.DatacenterMismatchFaultMsg;
import com.vmware.vim25.DatastoreMountPathDatastorePair;
import com.vmware.vim25.DatastoreNotWritableOnHostFaultMsg;
import com.vmware.vim25.DatastoreVVolContainerFailoverPair;
import com.vmware.vim25.DeviceUnsupportedForVmVersionFaultMsg;
import com.vmware.vim25.DiagnosticManagerLogDescriptor;
import com.vmware.vim25.DiagnosticManagerLogHeader;
import com.vmware.vim25.DisallowedMigrationDeviceAttachedFaultMsg;
import com.vmware.vim25.DiskChangeInfo;
import com.vmware.vim25.DiskCryptoSpec;
import com.vmware.vim25.DistributedVirtualPort;
import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerCompatibilityResult;
import com.vmware.vim25.DistributedVirtualSwitchManagerDvsProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainer;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.DistributedVirtualSwitchPortCriteria;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DuplicateNameFaultMsg;
import com.vmware.vim25.DvsFaultFaultMsg;
import com.vmware.vim25.DvsNotAuthorizedFaultMsg;
import com.vmware.vim25.DvsVmVnicResourcePoolConfigSpec;
import com.vmware.vim25.EVCConfigFaultFaultMsg;
import com.vmware.vim25.EntityBackupConfig;
import com.vmware.vim25.EntityPrivilege;
import com.vmware.vim25.EnvironmentBrowserConfigOptionQuerySpec;
import com.vmware.vim25.Event;
import com.vmware.vim25.EventArgDesc;
import com.vmware.vim25.EventFilterSpec;
import com.vmware.vim25.Extension;
import com.vmware.vim25.ExtensionManagerIpAllocationUsage;
import com.vmware.vim25.FaultToleranceConfigSpec;
import com.vmware.vim25.FcoeConfigFcoeSpecification;
import com.vmware.vim25.FcoeFaultPnicHasNoPortSetFaultMsg;
import com.vmware.vim25.FileAlreadyExistsFaultMsg;
import com.vmware.vim25.FileFaultFaultMsg;
import com.vmware.vim25.FileNotFoundFaultMsg;
import com.vmware.vim25.FileTransferInformation;
import com.vmware.vim25.FilterInUseFaultMsg;
import com.vmware.vim25.FolderNewHostSpec;
import com.vmware.vim25.GuestAliases;
import com.vmware.vim25.GuestAuthAliasInfo;
import com.vmware.vim25.GuestAuthSubject;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestListFileInfo;
import com.vmware.vim25.GuestMappedAliases;
import com.vmware.vim25.GuestOperationsFaultFaultMsg;
import com.vmware.vim25.GuestPermissionDeniedFaultMsg;
import com.vmware.vim25.GuestProcessInfo;
import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.GuestRegKeyRecordSpec;
import com.vmware.vim25.GuestRegValueNameSpec;
import com.vmware.vim25.GuestRegValueSpec;
import com.vmware.vim25.HealthUpdate;
import com.vmware.vim25.HealthUpdateInfo;
import com.vmware.vim25.HostAccessControlEntry;
import com.vmware.vim25.HostAccessMode;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.HostAutoStartManagerConfig;
import com.vmware.vim25.HostBootDeviceInfo;
import com.vmware.vim25.HostCacheConfigurationSpec;
import com.vmware.vim25.HostCapability;
import com.vmware.vim25.HostConfigFailedFaultMsg;
import com.vmware.vim25.HostConfigFaultFaultMsg;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.HostConnectFaultFaultMsg;
import com.vmware.vim25.HostConnectInfo;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.HostDatastoreBrowserSearchSpec;
import com.vmware.vim25.HostDatastoreSystemVvolDatastoreSpec;
import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.HostDateTimeSystemTimeZone;
import com.vmware.vim25.HostDiagnosticPartition;
import com.vmware.vim25.HostDiagnosticPartitionCreateDescription;
import com.vmware.vim25.HostDiagnosticPartitionCreateOption;
import com.vmware.vim25.HostDiagnosticPartitionCreateSpec;
import com.vmware.vim25.HostDiskDimensionsChs;
import com.vmware.vim25.HostDiskPartitionBlockRange;
import com.vmware.vim25.HostDiskPartitionInfo;
import com.vmware.vim25.HostDiskPartitionLayout;
import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostEsxAgentHostManagerConfigInfo;
import com.vmware.vim25.HostFeatureMask;
import com.vmware.vim25.HostFirewallDefaultPolicy;
import com.vmware.vim25.HostFirewallRulesetRulesetSpec;
import com.vmware.vim25.HostFlagInfo;
import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.HostImageProfileSummary;
import com.vmware.vim25.HostIncompatibleForRecordReplayFaultMsg;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties;
import com.vmware.vim25.HostInternetScsiHbaIPProperties;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaSendTarget;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteTableConfig;
import com.vmware.vim25.HostIpmiInfo;
import com.vmware.vim25.HostLockdownMode;
import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.HostMultipathInfoHppLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import com.vmware.vim25.HostNasVolumeSpec;
import com.vmware.vim25.HostNasVolumeUserInfo;
import com.vmware.vim25.HostNetworkConfig;
import com.vmware.vim25.HostNetworkConfigResult;
import com.vmware.vim25.HostNvmeConnectSpec;
import com.vmware.vim25.HostNvmeDisconnectSpec;
import com.vmware.vim25.HostNvmeDiscoverSpec;
import com.vmware.vim25.HostNvmeDiscoveryLog;
import com.vmware.vim25.HostPatchManagerLocator;
import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.HostPathSelectionPolicyOption;
import com.vmware.vim25.HostPciPassthruConfig;
import com.vmware.vim25.HostPortGroupSpec;
import com.vmware.vim25.HostPowerOpFailedFaultMsg;
import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.HostProfileManagerConfigTaskList;
import com.vmware.vim25.HostProfileManagerHostToConfigSpecMap;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostServiceTicket;
import com.vmware.vim25.HostSnmpConfigSpec;
import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.HostSpecificationOperationFailedFaultMsg;
import com.vmware.vim25.HostStorageArrayTypePolicyOption;
import com.vmware.vim25.HostSubSpecification;
import com.vmware.vim25.HostSystemReconnectSpec;
import com.vmware.vim25.HostSystemResourceInfo;
import com.vmware.vim25.HostSystemSwapConfiguration;
import com.vmware.vim25.HostTpmAttestationReport;
import com.vmware.vim25.HostUnresolvedVmfsResignatureSpec;
import com.vmware.vim25.HostUnresolvedVmfsResolutionResult;
import com.vmware.vim25.HostUnresolvedVmfsResolutionSpec;
import com.vmware.vim25.HostUnresolvedVmfsVolume;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigSpec;
import com.vmware.vim25.HostVFlashManagerVFlashResourceConfigSpec;
import com.vmware.vim25.HostVMotionCompatibility;
import com.vmware.vim25.HostVffsSpec;
import com.vmware.vim25.HostVffsVolume;
import com.vmware.vim25.HostVirtualNicSpec;
import com.vmware.vim25.HostVirtualSwitchSpec;
import com.vmware.vim25.HostVmfsSpec;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.HostVsanInternalSystemCmmdsQuery;
import com.vmware.vim25.HostVsanInternalSystemDeleteVsanObjectsResult;
import com.vmware.vim25.HostVsanInternalSystemVsanObjectOperationResult;
import com.vmware.vim25.HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import com.vmware.vim25.HttpFaultFaultMsg;
import com.vmware.vim25.HttpNfcLeaseManifestEntry;
import com.vmware.vim25.HttpNfcLeaseSourceFile;
import com.vmware.vim25.ID;
import com.vmware.vim25.IORMNotSupportedHostOnDatastoreFaultMsg;
import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.InaccessibleDatastoreFaultMsg;
import com.vmware.vim25.InaccessibleVFlashSourceFaultMsg;
import com.vmware.vim25.InsufficientResourcesFaultFaultMsg;
import com.vmware.vim25.InvalidArgumentFaultMsg;
import com.vmware.vim25.InvalidBundleFaultMsg;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import com.vmware.vim25.InvalidControllerFaultMsg;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import com.vmware.vim25.InvalidDatastorePathFaultMsg;
import com.vmware.vim25.InvalidDiskFormatFaultMsg;
import com.vmware.vim25.InvalidEventFaultMsg;
import com.vmware.vim25.InvalidFolderFaultMsg;
import com.vmware.vim25.InvalidGuestLoginFaultMsg;
import com.vmware.vim25.InvalidHostStateFaultMsg;
import com.vmware.vim25.InvalidIpmiLoginInfoFaultMsg;
import com.vmware.vim25.InvalidIpmiMacAddressFaultMsg;
import com.vmware.vim25.InvalidLicenseFaultMsg;
import com.vmware.vim25.InvalidLocaleFaultMsg;
import com.vmware.vim25.InvalidLoginFaultMsg;
import com.vmware.vim25.InvalidNameFaultMsg;
import com.vmware.vim25.InvalidPowerStateFaultMsg;
import com.vmware.vim25.InvalidPrivilegeFaultMsg;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.InvalidRequestFaultMsg;
import com.vmware.vim25.InvalidStateFaultMsg;
import com.vmware.vim25.InvalidTypeFaultMsg;
import com.vmware.vim25.IoFilterQueryIssueResult;
import com.vmware.vim25.IpPool;
import com.vmware.vim25.IpPoolManagerIpAllocation;
import com.vmware.vim25.IscsiFaultFaultMsg;
import com.vmware.vim25.IscsiFaultInvalidVnicFaultMsg;
import com.vmware.vim25.IscsiFaultVnicAlreadyBoundFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasActivePathsFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasMultipleUplinksFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasNoUplinksFaultMsg;
import com.vmware.vim25.IscsiFaultVnicHasWrongUplinkFaultMsg;
import com.vmware.vim25.IscsiFaultVnicIsLastPathFaultMsg;
import com.vmware.vim25.IscsiFaultVnicNotBoundFaultMsg;
import com.vmware.vim25.IscsiFaultVnicNotFoundFaultMsg;
import com.vmware.vim25.IscsiMigrationDependency;
import com.vmware.vim25.IscsiPortInfo;
import com.vmware.vim25.IscsiStatus;
import com.vmware.vim25.KernelModuleInfo;
import com.vmware.vim25.KeyNotFoundFaultMsg;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.KmipClusterInfo;
import com.vmware.vim25.KmipServerInfo;
import com.vmware.vim25.KmipServerSpec;
import com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment;
import com.vmware.vim25.LicenseAvailabilityInfo;
import com.vmware.vim25.LicenseEntityNotFoundFaultMsg;
import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import com.vmware.vim25.LicenseServerUnavailableFaultMsg;
import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.LicenseUsageInfo;
import com.vmware.vim25.LimitExceededFaultMsg;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.LogBundlingFailedFaultMsg;
import com.vmware.vim25.ManagedObjectNotFoundFaultMsg;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFaultFaultMsg;
import com.vmware.vim25.MismatchedBundleFaultMsg;
import com.vmware.vim25.MissingControllerFaultMsg;
import com.vmware.vim25.NoClientCertificateFaultMsg;
import com.vmware.vim25.NoDiskFoundFaultMsg;
import com.vmware.vim25.NoDiskSpaceFaultMsg;
import com.vmware.vim25.NoSubjectNameFaultMsg;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.NotFoundFaultMsg;
import com.vmware.vim25.NotSupportedFaultMsg;
import com.vmware.vim25.NvdimmNamespaceCreateSpec;
import com.vmware.vim25.NvdimmNamespaceDeleteSpec;
import com.vmware.vim25.NvdimmPMemNamespaceCreateSpec;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.ObjectFactory;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.OutOfBoundsFaultMsg;
import com.vmware.vim25.OvfCreateDescriptorParams;
import com.vmware.vim25.OvfCreateDescriptorResult;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfCreateImportSpecResult;
import com.vmware.vim25.OvfParseDescriptorParams;
import com.vmware.vim25.OvfParseDescriptorResult;
import com.vmware.vim25.OvfValidateHostParams;
import com.vmware.vim25.OvfValidateHostResult;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import com.vmware.vim25.PatchBinariesNotFoundFaultMsg;
import com.vmware.vim25.PatchInstallFailedFaultMsg;
import com.vmware.vim25.PatchMetadataInvalidFaultMsg;
import com.vmware.vim25.PatchNotApplicableFaultMsg;
import com.vmware.vim25.PerfCompositeMetric;
import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfInterval;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfProviderSummary;
import com.vmware.vim25.PerfQuerySpec;
import com.vmware.vim25.PerformanceManagerCounterLevelMapping;
import com.vmware.vim25.Permission;
import com.vmware.vim25.PhysicalNicHintInfo;
import com.vmware.vim25.PhysicalNicLinkInfo;
import com.vmware.vim25.PlacementResult;
import com.vmware.vim25.PlacementSpec;
import com.vmware.vim25.PlatformConfigFaultFaultMsg;
import com.vmware.vim25.PrivilegePolicyDef;
import com.vmware.vim25.ProductComponentInfo;
import com.vmware.vim25.ProfileCreateSpec;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import com.vmware.vim25.ProfileDescription;
import com.vmware.vim25.ProfileExecuteResult;
import com.vmware.vim25.ProfileExpressionMetadata;
import com.vmware.vim25.ProfileMetadata;
import com.vmware.vim25.ProfilePolicyMetadata;
import com.vmware.vim25.ProfileProfileStructure;
import com.vmware.vim25.ProfileUpdateFailedFaultMsg;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.RebootRequiredFaultMsg;
import com.vmware.vim25.RecordReplayDisabledFaultMsg;
import com.vmware.vim25.RemoveFailedFaultMsg;
import com.vmware.vim25.RequestCanceledFaultMsg;
import com.vmware.vim25.ResourceConfigOption;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.ResourceInUseFaultMsg;
import com.vmware.vim25.ResourceNotAvailableFaultMsg;
import com.vmware.vim25.RetrieveOptions;
import com.vmware.vim25.RetrieveResult;
import com.vmware.vim25.RetrieveVStorageObjSpec;
import com.vmware.vim25.RollbackFailureFaultMsg;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.SDDCBase;
import com.vmware.vim25.SSLVerifyFaultFaultMsg;
import com.vmware.vim25.SSPIChallengeFaultMsg;
import com.vmware.vim25.ScheduledTaskSpec;
import com.vmware.vim25.SelectionSet;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.ServiceManagerServiceInfo;
import com.vmware.vim25.SessionManagerGenericServiceTicket;
import com.vmware.vim25.SessionManagerLocalTicket;
import com.vmware.vim25.SessionManagerServiceRequestSpec;
import com.vmware.vim25.SiteInfo;
import com.vmware.vim25.SnapshotFaultFaultMsg;
import com.vmware.vim25.SoftwarePackage;
import com.vmware.vim25.SourceNodeSpec;
import com.vmware.vim25.StorageDrsConfigSpec;
import com.vmware.vim25.StorageIORMConfigOption;
import com.vmware.vim25.StorageIORMConfigSpec;
import com.vmware.vim25.StoragePerformanceSummary;
import com.vmware.vim25.StoragePlacementResult;
import com.vmware.vim25.StoragePlacementSpec;
import com.vmware.vim25.StructuredCustomizations;
import com.vmware.vim25.SystemEventInfo;
import com.vmware.vim25.TaskFilterSpec;
import com.vmware.vim25.TaskInProgressFaultMsg;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TimedoutFaultMsg;
import com.vmware.vim25.TooManyHostsFaultMsg;
import com.vmware.vim25.ToolsUnavailableFaultMsg;
import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.UsbScanCodeSpec;
import com.vmware.vim25.UserNotFoundFaultMsg;
import com.vmware.vim25.UserPrivilegeResult;
import com.vmware.vim25.UserSearchResult;
import com.vmware.vim25.UserSession;
import com.vmware.vim25.VAppCloneSpec;
import com.vmware.vim25.VAppConfigFaultFaultMsg;
import com.vmware.vim25.VAppConfigSpec;
import com.vmware.vim25.VMwareDvsLacpGroupSpec;
import com.vmware.vim25.VStorageObject;
import com.vmware.vim25.VStorageObjectAssociations;
import com.vmware.vim25.VStorageObjectSnapshotDetails;
import com.vmware.vim25.VStorageObjectSnapshotInfo;
import com.vmware.vim25.VStorageObjectStateInfo;
import com.vmware.vim25.VchaClusterConfigInfo;
import com.vmware.vim25.VchaClusterConfigSpec;
import com.vmware.vim25.VchaClusterDeploymentSpec;
import com.vmware.vim25.VchaClusterHealth;
import com.vmware.vim25.VchaClusterNetworkSpec;
import com.vmware.vim25.VimFaultFaultMsg;
import com.vmware.vim25.VirtualAppLinkInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskId;
import com.vmware.vim25.VirtualDiskSpec;
import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfo;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineConfigOption;
import com.vmware.vim25.VirtualMachineConfigOptionDescriptor;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineDisplayTopology;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineGuestQuiesceSpec;
import com.vmware.vim25.VirtualMachineInstantCloneSpec;
import com.vmware.vim25.VirtualMachineMemoryReservationSpec;
import com.vmware.vim25.VirtualMachineMksTicket;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.VirtualMachineTicket;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import com.vmware.vim25.VmConfigFaultFaultMsg;
import com.vmware.vim25.VmFaultToleranceIssueFaultMsg;
import com.vmware.vim25.VmToolsUpgradeFaultFaultMsg;
import com.vmware.vim25.VmfsAmbiguousMountFaultMsg;
import com.vmware.vim25.VmfsConfigOption;
import com.vmware.vim25.VmfsDatastoreCreateSpec;
import com.vmware.vim25.VmfsDatastoreExpandSpec;
import com.vmware.vim25.VmfsDatastoreExtendSpec;
import com.vmware.vim25.VmfsDatastoreOption;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import com.vmware.vim25.VsanFaultFaultMsg;
import com.vmware.vim25.VsanHostClusterStatus;
import com.vmware.vim25.VsanHostConfigInfo;
import com.vmware.vim25.VsanHostDiskMapping;
import com.vmware.vim25.VsanHostDiskResult;
import com.vmware.vim25.VsanNewPolicyBatch;
import com.vmware.vim25.VsanPolicyChangeBatch;
import com.vmware.vim25.VsanPolicySatisfiability;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckResult;
import com.vmware.vim25.VsanUpgradeSystemUpgradeStatus;
import com.vmware.vim25.VslmCloneSpec;
import com.vmware.vim25.VslmCreateSpec;
import com.vmware.vim25.VslmInfrastructureObjectPolicy;
import com.vmware.vim25.VslmInfrastructureObjectPolicySpec;
import com.vmware.vim25.VslmRelocateSpec;
import com.vmware.vim25.VslmTagEntry;
import com.vmware.vim25.WaitOptions;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "VimPortType", targetNamespace = "urn:vim25")
@XmlSeeAlso({ObjectFactory.class})
public interface VimPortType {
  @WebMethod(operationName = "AddAuthorizationRole", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddAuthorizationRole", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddAuthorizationRoleRequestType")
  @ResponseWrapper(localName = "AddAuthorizationRoleResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddAuthorizationRoleResponse")
  int addAuthorizationRole(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "privIds", targetNamespace = "urn:vim25") List<String> paramList) throws AlreadyExistsFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveAuthorizationRole", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveAuthorizationRole", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAuthorizationRoleRequestType")
  @ResponseWrapper(localName = "RemoveAuthorizationRoleResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAuthorizationRoleResponse")
  void removeAuthorizationRole(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "roleId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "failIfUsed", targetNamespace = "urn:vim25") boolean paramBoolean) throws NotFoundFaultMsg, RemoveFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateAuthorizationRole", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateAuthorizationRole", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAuthorizationRoleRequestType")
  @ResponseWrapper(localName = "UpdateAuthorizationRoleResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAuthorizationRoleResponse")
  void updateAuthorizationRole(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "roleId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "newName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "privIds", targetNamespace = "urn:vim25") List<String> paramList) throws AlreadyExistsFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MergePermissions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MergePermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MergePermissionsRequestType")
  @ResponseWrapper(localName = "MergePermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MergePermissionsResponse")
  void mergePermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "srcRoleId", targetNamespace = "urn:vim25") int paramInt1, @WebParam(name = "dstRoleId", targetNamespace = "urn:vim25") int paramInt2) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveRolePermissions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveRolePermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveRolePermissionsRequestType")
  @ResponseWrapper(localName = "RetrieveRolePermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveRolePermissionsResponse")
  List<Permission> retrieveRolePermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "roleId", targetNamespace = "urn:vim25") int paramInt) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveEntityPermissions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveEntityPermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveEntityPermissionsRequestType")
  @ResponseWrapper(localName = "RetrieveEntityPermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveEntityPermissionsResponse")
  List<Permission> retrieveEntityPermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "inherited", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveAllPermissions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveAllPermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAllPermissionsRequestType")
  @ResponseWrapper(localName = "RetrieveAllPermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAllPermissionsResponse")
  List<Permission> retrieveAllPermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetEntityPermissions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetEntityPermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetEntityPermissionsRequestType")
  @ResponseWrapper(localName = "SetEntityPermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetEntityPermissionsResponse")
  void setEntityPermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "permission", targetNamespace = "urn:vim25") List<Permission> paramList) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "ResetEntityPermissions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetEntityPermissions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetEntityPermissionsRequestType")
  @ResponseWrapper(localName = "ResetEntityPermissionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetEntityPermissionsResponse")
  void resetEntityPermissions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "permission", targetNamespace = "urn:vim25") List<Permission> paramList) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "RemoveEntityPermission", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveEntityPermission", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveEntityPermissionRequestType")
  @ResponseWrapper(localName = "RemoveEntityPermissionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveEntityPermissionResponse")
  void removeEntityPermission(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "user", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "isGroup", targetNamespace = "urn:vim25") boolean paramBoolean) throws AuthMinimumAdminPermissionFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HasPrivilegeOnEntity", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HasPrivilegeOnEntity", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasPrivilegeOnEntityRequestType")
  @ResponseWrapper(localName = "HasPrivilegeOnEntityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasPrivilegeOnEntityResponse")
  List<Boolean> hasPrivilegeOnEntity(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "sessionId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "privId", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HasPrivilegeOnEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HasPrivilegeOnEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasPrivilegeOnEntitiesRequestType")
  @ResponseWrapper(localName = "HasPrivilegeOnEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasPrivilegeOnEntitiesResponse")
  List<EntityPrivilege> hasPrivilegeOnEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "sessionId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "privId", targetNamespace = "urn:vim25") List<String> paramList1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HasUserPrivilegeOnEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HasUserPrivilegeOnEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasUserPrivilegeOnEntitiesRequestType")
  @ResponseWrapper(localName = "HasUserPrivilegeOnEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasUserPrivilegeOnEntitiesResponse")
  List<EntityPrivilege> hasUserPrivilegeOnEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "privId", targetNamespace = "urn:vim25") List<String> paramList1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FetchUserPrivilegeOnEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FetchUserPrivilegeOnEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchUserPrivilegeOnEntitiesRequestType")
  @ResponseWrapper(localName = "FetchUserPrivilegeOnEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchUserPrivilegeOnEntitiesResponse")
  List<UserPrivilegeResult> fetchUserPrivilegeOnEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CertMgrRefreshCACertificatesAndCRLs_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CertMgrRefreshCACertificatesAndCRLs_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRefreshCACertificatesAndCRLsRequestType")
  @ResponseWrapper(localName = "CertMgrRefreshCACertificatesAndCRLs_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRefreshCACertificatesAndCRLsTaskResponse")
  ManagedObjectReference certMgrRefreshCACertificatesAndCRLsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CertMgrRefreshCertificates_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CertMgrRefreshCertificates_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRefreshCertificatesRequestType")
  @ResponseWrapper(localName = "CertMgrRefreshCertificates_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRefreshCertificatesTaskResponse")
  ManagedObjectReference certMgrRefreshCertificatesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CertMgrRevokeCertificates_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CertMgrRevokeCertificates_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRevokeCertificatesRequestType")
  @ResponseWrapper(localName = "CertMgrRevokeCertificates_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CertMgrRevokeCertificatesTaskResponse")
  ManagedObjectReference certMgrRevokeCertificatesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureHCI_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureHCI_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureHCIRequestType")
  @ResponseWrapper(localName = "ConfigureHCI_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureHCITaskResponse")
  ManagedObjectReference configureHCITask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusterSpec", targetNamespace = "urn:vim25") ClusterComputeResourceHCIConfigSpec paramClusterComputeResourceHCIConfigSpec, @WebParam(name = "hostInputs", targetNamespace = "urn:vim25") List<ClusterComputeResourceHostConfigurationInput> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExtendHCI_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExtendHCI_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendHCIRequestType")
  @ResponseWrapper(localName = "ExtendHCI_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendHCITaskResponse")
  ManagedObjectReference extendHCITask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostInputs", targetNamespace = "urn:vim25") List<ClusterComputeResourceHostConfigurationInput> paramList, @WebParam(name = "vSanConfigSpec", targetNamespace = "urn:vim25") SDDCBase paramSDDCBase) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AbandonHciWorkflow", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AbandonHciWorkflow", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbandonHciWorkflowRequestType")
  @ResponseWrapper(localName = "AbandonHciWorkflowResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbandonHciWorkflowResponse")
  void abandonHciWorkflow(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ValidateHCIConfiguration", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ValidateHCIConfiguration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHCIConfigurationRequestType")
  @ResponseWrapper(localName = "ValidateHCIConfigurationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHCIConfigurationResponse")
  List<ClusterComputeResourceValidationResultBase> validateHCIConfiguration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hciConfigSpec", targetNamespace = "urn:vim25") ClusterComputeResourceHCIConfigSpec paramClusterComputeResourceHCIConfigSpec, @WebParam(name = "hosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureCluster_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureCluster_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureClusterRequestType")
  @ResponseWrapper(localName = "ReconfigureCluster_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureClusterTaskResponse")
  ManagedObjectReference reconfigureClusterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") ClusterConfigSpec paramClusterConfigSpec, @WebParam(name = "modify", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyRecommendation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ApplyRecommendation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyRecommendationRequestType")
  @ResponseWrapper(localName = "ApplyRecommendationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyRecommendationResponse")
  void applyRecommendation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CancelRecommendation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CancelRecommendation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelRecommendationRequestType")
  @ResponseWrapper(localName = "CancelRecommendationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelRecommendationResponse")
  void cancelRecommendation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RecommendHostsForVm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RecommendHostsForVm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommendHostsForVmRequestType")
  @ResponseWrapper(localName = "RecommendHostsForVmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommendHostsForVmResponse")
  List<ClusterHostRecommendation> recommendHostsForVm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddHostRequestType")
  @ResponseWrapper(localName = "AddHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddHostTaskResponse")
  ManagedObjectReference addHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostConnectSpec paramHostConnectSpec, @WebParam(name = "asConnected", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "resourcePool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "license", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveInto_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveInto_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoRequestType")
  @ResponseWrapper(localName = "MoveInto_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoTaskResponse")
  ManagedObjectReference moveIntoTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws DuplicateNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TooManyHostsFaultMsg;
  
  @WebMethod(operationName = "MoveHostInto_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveHostInto_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveHostIntoRequestType")
  @ResponseWrapper(localName = "MoveHostInto_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveHostIntoTaskResponse")
  ManagedObjectReference moveHostIntoTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "resourcePool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TooManyHostsFaultMsg;
  
  @WebMethod(operationName = "RefreshRecommendation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshRecommendation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshRecommendationRequestType")
  @ResponseWrapper(localName = "RefreshRecommendationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshRecommendationResponse")
  void refreshRecommendation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EvcManager", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EvcManager", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EvcManagerRequestType")
  @ResponseWrapper(localName = "EvcManagerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EvcManagerResponse")
  ManagedObjectReference evcManager(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveDasAdvancedRuntimeInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveDasAdvancedRuntimeInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDasAdvancedRuntimeInfoRequestType")
  @ResponseWrapper(localName = "RetrieveDasAdvancedRuntimeInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDasAdvancedRuntimeInfoResponse")
  ClusterDasAdvancedRuntimeInfo retrieveDasAdvancedRuntimeInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClusterEnterMaintenanceMode", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ClusterEnterMaintenanceMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClusterEnterMaintenanceModeRequestType")
  @ResponseWrapper(localName = "ClusterEnterMaintenanceModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClusterEnterMaintenanceModeResponse")
  ClusterEnterMaintenanceResult clusterEnterMaintenanceMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "option", targetNamespace = "urn:vim25") List<OptionValue> paramList1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PlaceVm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PlaceVm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PlaceVmRequestType")
  @ResponseWrapper(localName = "PlaceVmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PlaceVmResponse")
  PlacementResult placeVm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "placementSpec", targetNamespace = "urn:vim25") PlacementSpec paramPlacementSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindRulesForVm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindRulesForVm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindRulesForVmRequestType")
  @ResponseWrapper(localName = "FindRulesForVmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindRulesForVmResponse")
  List<ClusterRuleInfo> findRulesForVm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "StampAllRulesWithUuid_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StampAllRulesWithUuid_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StampAllRulesWithUuidRequestType")
  @ResponseWrapper(localName = "StampAllRulesWithUuid_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StampAllRulesWithUuidTaskResponse")
  ManagedObjectReference stampAllRulesWithUuidTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetResourceUsage", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetResourceUsage", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetResourceUsageRequestType")
  @ResponseWrapper(localName = "GetResourceUsageResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetResourceUsageResponse")
  ClusterResourceUsageSummary getResourceUsage(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetCryptoMode", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetCryptoMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCryptoModeRequestType")
  @ResponseWrapper(localName = "SetCryptoModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCryptoModeResponse")
  void setCryptoMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cryptoMode", targetNamespace = "urn:vim25") String paramString) throws InvalidArgumentFaultMsg, InvalidRequestFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureComputeResource_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureComputeResource_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureComputeResourceRequestType")
  @ResponseWrapper(localName = "ReconfigureComputeResource_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureComputeResourceTaskResponse")
  ManagedObjectReference reconfigureComputeResourceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") ComputeResourceConfigSpec paramComputeResourceConfigSpec, @WebParam(name = "modify", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddCustomFieldDef", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddCustomFieldDef", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddCustomFieldDefRequestType")
  @ResponseWrapper(localName = "AddCustomFieldDefResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddCustomFieldDefResponse")
  CustomFieldDef addCustomFieldDef(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "moType", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "fieldDefPolicy", targetNamespace = "urn:vim25") PrivilegePolicyDef paramPrivilegePolicyDef1, @WebParam(name = "fieldPolicy", targetNamespace = "urn:vim25") PrivilegePolicyDef paramPrivilegePolicyDef2) throws DuplicateNameFaultMsg, InvalidPrivilegeFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveCustomFieldDef", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveCustomFieldDef", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveCustomFieldDefRequestType")
  @ResponseWrapper(localName = "RemoveCustomFieldDefResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveCustomFieldDefResponse")
  void removeCustomFieldDef(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RenameCustomFieldDef", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RenameCustomFieldDef", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameCustomFieldDefRequestType")
  @ResponseWrapper(localName = "RenameCustomFieldDefResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameCustomFieldDefResponse")
  void renameCustomFieldDef(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetField", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetField", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetFieldRequestType")
  @ResponseWrapper(localName = "SetFieldResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetFieldResponse")
  void setField(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "key", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "value", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DoesCustomizationSpecExist", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DoesCustomizationSpecExist", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DoesCustomizationSpecExistRequestType")
  @ResponseWrapper(localName = "DoesCustomizationSpecExistResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DoesCustomizationSpecExistResponse")
  boolean doesCustomizationSpecExist(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetCustomizationSpec", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetCustomizationSpecRequestType")
  @ResponseWrapper(localName = "GetCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetCustomizationSpecResponse")
  CustomizationSpecItem getCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCustomizationSpecRequestType")
  @ResponseWrapper(localName = "CreateCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCustomizationSpecResponse")
  void createCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "item", targetNamespace = "urn:vim25") CustomizationSpecItem paramCustomizationSpecItem) throws AlreadyExistsFaultMsg, CustomizationFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "OverwriteCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "OverwriteCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.OverwriteCustomizationSpecRequestType")
  @ResponseWrapper(localName = "OverwriteCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.OverwriteCustomizationSpecResponse")
  void overwriteCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "item", targetNamespace = "urn:vim25") CustomizationSpecItem paramCustomizationSpecItem) throws ConcurrentAccessFaultMsg, CustomizationFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteCustomizationSpecRequestType")
  @ResponseWrapper(localName = "DeleteCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteCustomizationSpecResponse")
  void deleteCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DuplicateCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DuplicateCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DuplicateCustomizationSpecRequestType")
  @ResponseWrapper(localName = "DuplicateCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DuplicateCustomizationSpecResponse")
  void duplicateCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "newName", targetNamespace = "urn:vim25") String paramString2) throws AlreadyExistsFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RenameCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RenameCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameCustomizationSpecRequestType")
  @ResponseWrapper(localName = "RenameCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameCustomizationSpecResponse")
  void renameCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "newName", targetNamespace = "urn:vim25") String paramString2) throws AlreadyExistsFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CustomizationSpecItemToXml", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CustomizationSpecItemToXml", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizationSpecItemToXmlRequestType")
  @ResponseWrapper(localName = "CustomizationSpecItemToXmlResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizationSpecItemToXmlResponse")
  String customizationSpecItemToXml(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "item", targetNamespace = "urn:vim25") CustomizationSpecItem paramCustomizationSpecItem) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "XmlToCustomizationSpecItem", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "XmlToCustomizationSpecItem", targetNamespace = "urn:vim25", className = "com.vmware.vim25.XmlToCustomizationSpecItemRequestType")
  @ResponseWrapper(localName = "XmlToCustomizationSpecItemResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.XmlToCustomizationSpecItemResponse")
  CustomizationSpecItem xmlToCustomizationSpecItem(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "specItemXml", targetNamespace = "urn:vim25") String paramString) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckCustomizationResources", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CheckCustomizationResources", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCustomizationResourcesRequestType")
  @ResponseWrapper(localName = "CheckCustomizationResourcesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCustomizationResourcesResponse")
  void checkCustomizationResources(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "guestOs", targetNamespace = "urn:vim25") String paramString) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BatchQueryConnectInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "BatchQueryConnectInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchQueryConnectInfoRequestType")
  @ResponseWrapper(localName = "BatchQueryConnectInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchQueryConnectInfoResponse")
  List<DatacenterBasicConnectInfo> batchQueryConnectInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostSpecs", targetNamespace = "urn:vim25") List<HostConnectSpec> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConnectionInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConnectionInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConnectionInfoRequestType")
  @ResponseWrapper(localName = "QueryConnectionInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConnectionInfoResponse")
  HostConnectInfo queryConnectionInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostname", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "port", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "username", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString3, @WebParam(name = "sslThumbprint", targetNamespace = "urn:vim25") String paramString4) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConnectionInfoViaSpec", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConnectionInfoViaSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConnectionInfoViaSpecRequestType")
  @ResponseWrapper(localName = "QueryConnectionInfoViaSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConnectionInfoViaSpecResponse")
  HostConnectInfo queryConnectionInfoViaSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostConnectSpec paramHostConnectSpec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PowerOnMultiVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerOnMultiVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnMultiVMRequestType")
  @ResponseWrapper(localName = "PowerOnMultiVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnMultiVMTaskResponse")
  ManagedObjectReference powerOnMultiVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vm", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "option", targetNamespace = "urn:vim25") List<OptionValue> paramList1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "queryDatacenterConfigOptionDescriptor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDatacenterConfigOptionDescriptorRequestType")
  @ResponseWrapper(localName = "queryDatacenterConfigOptionDescriptorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDatacenterConfigOptionDescriptorResponse")
  List<VirtualMachineConfigOptionDescriptor> queryDatacenterConfigOptionDescriptor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureDatacenter_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureDatacenter_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDatacenterRequestType")
  @ResponseWrapper(localName = "ReconfigureDatacenter_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDatacenterTaskResponse")
  ManagedObjectReference reconfigureDatacenterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") DatacenterConfigSpec paramDatacenterConfigSpec, @WebParam(name = "modify", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshDatastore", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDatastoreRequestType")
  @ResponseWrapper(localName = "RefreshDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDatastoreResponse")
  void refreshDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshDatastoreStorageInfo", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshDatastoreStorageInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDatastoreStorageInfoRequestType")
  @ResponseWrapper(localName = "RefreshDatastoreStorageInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDatastoreStorageInfoResponse")
  void refreshDatastoreStorageInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVirtualMachineFiles_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVirtualMachineFiles_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualMachineFilesRequestType")
  @ResponseWrapper(localName = "UpdateVirtualMachineFiles_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualMachineFilesTaskResponse")
  ManagedObjectReference updateVirtualMachineFilesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mountPathDatastoreMapping", targetNamespace = "urn:vim25") List<DatastoreMountPathDatastorePair> paramList) throws InvalidDatastoreFaultMsg, PlatformConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RenameDatastore", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RenameDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameDatastoreRequestType")
  @ResponseWrapper(localName = "RenameDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameDatastoreResponse")
  void renameDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "newName", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyDatastore", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyDatastoreRequestType")
  @ResponseWrapper(localName = "DestroyDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyDatastoreResponse")
  void destroyDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DatastoreEnterMaintenanceMode", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DatastoreEnterMaintenanceMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DatastoreEnterMaintenanceModeRequestType")
  @ResponseWrapper(localName = "DatastoreEnterMaintenanceModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DatastoreEnterMaintenanceModeResponse")
  StoragePlacementResult datastoreEnterMaintenanceMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DatastoreExitMaintenanceMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DatastoreExitMaintenanceMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DatastoreExitMaintenanceModeRequestType")
  @ResponseWrapper(localName = "DatastoreExitMaintenanceMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DatastoreExitMaintenanceModeTaskResponse")
  ManagedObjectReference datastoreExitMaintenanceModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVVolVirtualMachineFiles_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVVolVirtualMachineFiles_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVVolVirtualMachineFilesRequestType")
  @ResponseWrapper(localName = "UpdateVVolVirtualMachineFiles_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVVolVirtualMachineFilesTaskResponse")
  ManagedObjectReference updateVVolVirtualMachineFilesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "failoverPair", targetNamespace = "urn:vim25") List<DatastoreVVolContainerFailoverPair> paramList) throws InvalidDatastoreFaultMsg, NotSupportedFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateDirectory", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDirectory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDirectoryRequestType")
  @ResponseWrapper(localName = "CreateDirectoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDirectoryResponse")
  String createDirectory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "displayName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "policy", targetNamespace = "urn:vim25") String paramString2) throws CannotCreateFileFaultMsg, FileAlreadyExistsFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteDirectory", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteDirectory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDirectoryRequestType")
  @ResponseWrapper(localName = "DeleteDirectoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDirectoryResponse")
  void deleteDirectory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "datastorePath", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, FileNotFoundFaultMsg, InvalidDatastoreFaultMsg, InvalidDatastorePathFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConvertNamespacePathToUuidPath", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConvertNamespacePathToUuidPath", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConvertNamespacePathToUuidPathRequestType")
  @ResponseWrapper(localName = "ConvertNamespacePathToUuidPathResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConvertNamespacePathToUuidPathResponse")
  String convertNamespacePathToUuidPath(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "namespaceUrl", targetNamespace = "urn:vim25") String paramString) throws InvalidDatastoreFaultMsg, InvalidDatastorePathFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDescriptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDescriptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDescriptionsRequestType")
  @ResponseWrapper(localName = "QueryDescriptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDescriptionsResponse")
  List<DiagnosticManagerLogDescriptor> queryDescriptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BrowseDiagnosticLog", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "BrowseDiagnosticLog", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BrowseDiagnosticLogRequestType")
  @ResponseWrapper(localName = "BrowseDiagnosticLogResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BrowseDiagnosticLogResponse")
  DiagnosticManagerLogHeader browseDiagnosticLog(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "start", targetNamespace = "urn:vim25") Integer paramInteger1, @WebParam(name = "lines", targetNamespace = "urn:vim25") Integer paramInteger2) throws CannotAccessFileFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateLogBundles_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateLogBundles_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateLogBundlesRequestType")
  @ResponseWrapper(localName = "GenerateLogBundles_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateLogBundlesTaskResponse")
  ManagedObjectReference generateLogBundlesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "includeDefault", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws LogBundlingFailedFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "FetchDVPortKeys", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FetchDVPortKeys", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchDVPortKeysRequestType")
  @ResponseWrapper(localName = "FetchDVPortKeysResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchDVPortKeysResponse")
  List<String> fetchDVPortKeys(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "criteria", targetNamespace = "urn:vim25") DistributedVirtualSwitchPortCriteria paramDistributedVirtualSwitchPortCriteria) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FetchDVPorts", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FetchDVPorts", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchDVPortsRequestType")
  @ResponseWrapper(localName = "FetchDVPortsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchDVPortsResponse")
  List<DistributedVirtualPort> fetchDVPorts(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "criteria", targetNamespace = "urn:vim25") DistributedVirtualSwitchPortCriteria paramDistributedVirtualSwitchPortCriteria) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryUsedVlanIdInDvs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryUsedVlanIdInDvs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUsedVlanIdInDvsRequestType")
  @ResponseWrapper(localName = "QueryUsedVlanIdInDvsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUsedVlanIdInDvsResponse")
  List<Integer> queryUsedVlanIdInDvs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureDvs_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureDvs_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDvsRequestType")
  @ResponseWrapper(localName = "ReconfigureDvs_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDvsTaskResponse")
  ManagedObjectReference reconfigureDvsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") DVSConfigSpec paramDVSConfigSpec) throws AlreadyExistsFaultMsg, ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, DvsFaultFaultMsg, DvsNotAuthorizedFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, LimitExceededFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, ResourceNotAvailableFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PerformDvsProductSpecOperation_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PerformDvsProductSpecOperation_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformDvsProductSpecOperationRequestType")
  @ResponseWrapper(localName = "PerformDvsProductSpecOperation_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformDvsProductSpecOperationTaskResponse")
  ManagedObjectReference performDvsProductSpecOperationTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "operation", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "productSpec", targetNamespace = "urn:vim25") DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) throws DvsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "MergeDvs_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MergeDvs_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MergeDvsRequestType")
  @ResponseWrapper(localName = "MergeDvs_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MergeDvsTaskResponse")
  ManagedObjectReference mergeDvsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dvs", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws DvsFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddDVPortgroup_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddDVPortgroup_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddDVPortgroupRequestType")
  @ResponseWrapper(localName = "AddDVPortgroup_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddDVPortgroupTaskResponse")
  ManagedObjectReference addDVPortgroupTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") List<DVPortgroupConfigSpec> paramList) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveDVPort_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveDVPort_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDVPortRequestType")
  @ResponseWrapper(localName = "MoveDVPort_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDVPortTaskResponse")
  ManagedObjectReference moveDVPortTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portKey", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "destinationPortgroupKey", targetNamespace = "urn:vim25") String paramString) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDvsCapability", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDvsCapability", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDvsCapabilityRequestType")
  @ResponseWrapper(localName = "UpdateDvsCapabilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDvsCapabilityResponse")
  void updateDvsCapability(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "capability", targetNamespace = "urn:vim25") DVSCapability paramDVSCapability) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureDVPort_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureDVPort_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDVPortRequestType")
  @ResponseWrapper(localName = "ReconfigureDVPort_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDVPortTaskResponse")
  ManagedObjectReference reconfigureDVPortTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "port", targetNamespace = "urn:vim25") List<DVPortConfigSpec> paramList) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshDVPortState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshDVPortState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDVPortStateRequestType")
  @ResponseWrapper(localName = "RefreshDVPortStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDVPortStateResponse")
  void refreshDVPortState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portKeys", targetNamespace = "urn:vim25") List<String> paramList) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RectifyDvsHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RectifyDvsHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RectifyDvsHostRequestType")
  @ResponseWrapper(localName = "RectifyDvsHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RectifyDvsHostTaskResponse")
  ManagedObjectReference rectifyDvsHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateNetworkResourcePool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateNetworkResourcePool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateNetworkResourcePoolRequestType")
  @ResponseWrapper(localName = "UpdateNetworkResourcePoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateNetworkResourcePoolResponse")
  void updateNetworkResourcePool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") List<DVSNetworkResourcePoolConfigSpec> paramList) throws ConcurrentAccessFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddNetworkResourcePool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddNetworkResourcePool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddNetworkResourcePoolRequestType")
  @ResponseWrapper(localName = "AddNetworkResourcePoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddNetworkResourcePoolResponse")
  void addNetworkResourcePool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") List<DVSNetworkResourcePoolConfigSpec> paramList) throws DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveNetworkResourcePool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveNetworkResourcePool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveNetworkResourcePoolRequestType")
  @ResponseWrapper(localName = "RemoveNetworkResourcePoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveNetworkResourcePoolResponse")
  void removeNetworkResourcePool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") List<String> paramList) throws DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DvsReconfigureVmVnicNetworkResourcePool_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DvsReconfigureVmVnicNetworkResourcePool_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DvsReconfigureVmVnicNetworkResourcePoolRequestType")
  @ResponseWrapper(localName = "DvsReconfigureVmVnicNetworkResourcePool_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DvsReconfigureVmVnicNetworkResourcePoolTaskResponse")
  ManagedObjectReference dvsReconfigureVmVnicNetworkResourcePoolTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") List<DvsVmVnicResourcePoolConfigSpec> paramList) throws ConcurrentAccessFaultMsg, ConflictingConfigurationFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableNetworkResourceManagement", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableNetworkResourceManagement", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableNetworkResourceManagementRequestType")
  @ResponseWrapper(localName = "EnableNetworkResourceManagementResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableNetworkResourceManagementResponse")
  void enableNetworkResourceManagement(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "enable", targetNamespace = "urn:vim25") boolean paramBoolean) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DVSRollback_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DVSRollback_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSRollbackRequestType")
  @ResponseWrapper(localName = "DVSRollback_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSRollbackTaskResponse")
  ManagedObjectReference dvsRollbackTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entityBackup", targetNamespace = "urn:vim25") EntityBackupConfig paramEntityBackupConfig) throws DvsFaultFaultMsg, RollbackFailureFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDVPortgroup_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDVPortgroup_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDVPortgroupRequestType")
  @ResponseWrapper(localName = "CreateDVPortgroup_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDVPortgroupTaskResponse")
  ManagedObjectReference createDVPortgroupTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") DVPortgroupConfigSpec paramDVPortgroupConfigSpec) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDVSHealthCheckConfig_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateDVSHealthCheckConfig_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDVSHealthCheckConfigRequestType")
  @ResponseWrapper(localName = "UpdateDVSHealthCheckConfig_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDVSHealthCheckConfigTaskResponse")
  ManagedObjectReference updateDVSHealthCheckConfigTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "healthCheckConfig", targetNamespace = "urn:vim25") List<DVSHealthCheckConfig> paramList) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LookupDvPortGroup", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LookupDvPortGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LookupDvPortGroupRequestType")
  @ResponseWrapper(localName = "LookupDvPortGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LookupDvPortGroupResponse")
  ManagedObjectReference lookupDvPortGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portgroupKey", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConfigOptionDescriptor", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConfigOptionDescriptor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionDescriptorRequestType")
  @ResponseWrapper(localName = "QueryConfigOptionDescriptorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionDescriptorResponse")
  List<VirtualMachineConfigOptionDescriptor> queryConfigOptionDescriptor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConfigOption", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConfigOption", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionRequestType")
  @ResponseWrapper(localName = "QueryConfigOptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionResponse")
  VirtualMachineConfigOption queryConfigOption(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConfigOptionEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConfigOptionEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionExRequestType")
  @ResponseWrapper(localName = "QueryConfigOptionExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigOptionExResponse")
  VirtualMachineConfigOption queryConfigOptionEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") EnvironmentBrowserConfigOptionQuerySpec paramEnvironmentBrowserConfigOptionQuerySpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConfigTarget", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConfigTarget", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigTargetRequestType")
  @ResponseWrapper(localName = "QueryConfigTargetResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfigTargetResponse")
  ConfigTarget queryConfigTarget(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryTargetCapabilities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryTargetCapabilities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryTargetCapabilitiesRequestType")
  @ResponseWrapper(localName = "QueryTargetCapabilitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryTargetCapabilitiesResponse")
  HostCapability queryTargetCapabilities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @RequestWrapper(localName = "setCustomValue", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCustomValueRequestType")
  @ResponseWrapper(localName = "setCustomValueResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCustomValueResponse")
  void setCustomValue(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "value", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnregisterExtension", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnregisterExtension", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterExtensionRequestType")
  @ResponseWrapper(localName = "UnregisterExtensionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterExtensionResponse")
  void unregisterExtension(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindExtension", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindExtension", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindExtensionRequestType")
  @ResponseWrapper(localName = "FindExtensionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindExtensionResponse")
  Extension findExtension(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterExtension", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RegisterExtension", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterExtensionRequestType")
  @ResponseWrapper(localName = "RegisterExtensionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterExtensionResponse")
  void registerExtension(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extension", targetNamespace = "urn:vim25") Extension paramExtension) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateExtension", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateExtension", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateExtensionRequestType")
  @ResponseWrapper(localName = "UpdateExtensionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateExtensionResponse")
  void updateExtension(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extension", targetNamespace = "urn:vim25") Extension paramExtension) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetPublicKey", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetPublicKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetPublicKeyRequestType")
  @ResponseWrapper(localName = "GetPublicKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetPublicKeyResponse")
  String getPublicKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetPublicKey", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetPublicKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetPublicKeyRequestType")
  @ResponseWrapper(localName = "SetPublicKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetPublicKeyResponse")
  void setPublicKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "publicKey", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetExtensionCertificate", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetExtensionCertificate", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetExtensionCertificateRequestType")
  @ResponseWrapper(localName = "SetExtensionCertificateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetExtensionCertificateResponse")
  void setExtensionCertificate(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "certificatePem", targetNamespace = "urn:vim25") String paramString2) throws NoClientCertificateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryManagedBy", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryManagedBy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryManagedByRequestType")
  @ResponseWrapper(localName = "QueryManagedByResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryManagedByResponse")
  List<ManagedObjectReference> queryManagedBy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryExtensionIpAllocationUsage", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryExtensionIpAllocationUsage", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryExtensionIpAllocationUsageRequestType")
  @ResponseWrapper(localName = "QueryExtensionIpAllocationUsageResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryExtensionIpAllocationUsageResponse")
  List<ExtensionManagerIpAllocationUsage> queryExtensionIpAllocationUsage(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKeys", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveDatastoreFile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveDatastoreFile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDatastoreFileRequestType")
  @ResponseWrapper(localName = "MoveDatastoreFile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDatastoreFileTaskResponse")
  ManagedObjectReference moveDatastoreFileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "sourceName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "sourceDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "destinationName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "destinationDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CopyDatastoreFile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CopyDatastoreFile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CopyDatastoreFileRequestType")
  @ResponseWrapper(localName = "CopyDatastoreFile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CopyDatastoreFileTaskResponse")
  ManagedObjectReference copyDatastoreFileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "sourceName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "sourceDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "destinationName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "destinationDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteDatastoreFile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteDatastoreFile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDatastoreFileRequestType")
  @ResponseWrapper(localName = "DeleteDatastoreFile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDatastoreFileTaskResponse")
  ManagedObjectReference deleteDatastoreFileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MakeDirectory", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MakeDirectory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakeDirectoryRequestType")
  @ResponseWrapper(localName = "MakeDirectoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakeDirectoryResponse")
  void makeDirectory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "createParentDirectories", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ChangeOwner", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangeOwner", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeOwnerRequestType")
  @ResponseWrapper(localName = "ChangeOwnerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeOwnerResponse")
  void changeOwner(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "owner", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "CreateFolder", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateFolder", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateFolderRequestType")
  @ResponseWrapper(localName = "CreateFolderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateFolderResponse")
  ManagedObjectReference createFolder(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveIntoFolder_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveIntoFolder_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoFolderRequestType")
  @ResponseWrapper(localName = "MoveIntoFolder_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoFolderTaskResponse")
  ManagedObjectReference moveIntoFolderTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "list", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws DuplicateNameFaultMsg, InvalidFolderFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVMRequestType")
  @ResponseWrapper(localName = "CreateVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVMTaskResponse")
  ManagedObjectReference createVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "config", targetNamespace = "urn:vim25") VirtualMachineConfigSpec paramVirtualMachineConfigSpec, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RegisterVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterVMRequestType")
  @ResponseWrapper(localName = "RegisterVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterVMTaskResponse")
  ManagedObjectReference registerVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "asTemplate", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CreateCluster", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateCluster", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateClusterRequestType")
  @ResponseWrapper(localName = "CreateClusterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateClusterResponse")
  ManagedObjectReference createCluster(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") ClusterConfigSpec paramClusterConfigSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateClusterEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateClusterEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateClusterExRequestType")
  @ResponseWrapper(localName = "CreateClusterExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateClusterExResponse")
  ManagedObjectReference createClusterEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") ClusterConfigSpecEx paramClusterConfigSpecEx) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddStandaloneHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddStandaloneHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddStandaloneHostRequestType")
  @ResponseWrapper(localName = "AddStandaloneHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddStandaloneHostTaskResponse")
  ManagedObjectReference addStandaloneHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostConnectSpec paramHostConnectSpec, @WebParam(name = "compResSpec", targetNamespace = "urn:vim25") ComputeResourceConfigSpec paramComputeResourceConfigSpec, @WebParam(name = "addConnected", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "license", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDatacenter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDatacenter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDatacenterRequestType")
  @ResponseWrapper(localName = "CreateDatacenterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDatacenterResponse")
  ManagedObjectReference createDatacenter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnregisterAndDestroy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UnregisterAndDestroy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterAndDestroyRequestType")
  @ResponseWrapper(localName = "UnregisterAndDestroy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterAndDestroyTaskResponse")
  ManagedObjectReference unregisterAndDestroyTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ConcurrentAccessFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDVS_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDVS_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDVSRequestType")
  @ResponseWrapper(localName = "CreateDVS_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDVSTaskResponse")
  ManagedObjectReference createDVSTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") DVSCreateSpec paramDVSCreateSpec) throws DuplicateNameFaultMsg, DvsFaultFaultMsg, DvsNotAuthorizedFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateStoragePod", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateStoragePod", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateStoragePodRequestType")
  @ResponseWrapper(localName = "CreateStoragePodResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateStoragePodResponse")
  ManagedObjectReference createStoragePod(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BatchAddStandaloneHosts_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "BatchAddStandaloneHosts_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchAddStandaloneHostsRequestType")
  @ResponseWrapper(localName = "BatchAddStandaloneHosts_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchAddStandaloneHostsTaskResponse")
  ManagedObjectReference batchAddStandaloneHostsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "newHosts", targetNamespace = "urn:vim25") List<FolderNewHostSpec> paramList, @WebParam(name = "compResSpec", targetNamespace = "urn:vim25") ComputeResourceConfigSpec paramComputeResourceConfigSpec, @WebParam(name = "addConnected", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BatchAddHostsToCluster_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "BatchAddHostsToCluster_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchAddHostsToClusterRequestType")
  @ResponseWrapper(localName = "BatchAddHostsToCluster_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BatchAddHostsToClusterTaskResponse")
  ManagedObjectReference batchAddHostsToClusterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "newHosts", targetNamespace = "urn:vim25") List<FolderNewHostSpec> paramList, @WebParam(name = "existingHosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "compResSpec", targetNamespace = "urn:vim25") ComputeResourceConfigSpec paramComputeResourceConfigSpec, @WebParam(name = "desiredState", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterHealthUpdateProvider", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RegisterHealthUpdateProvider", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterHealthUpdateProviderRequestType")
  @ResponseWrapper(localName = "RegisterHealthUpdateProviderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterHealthUpdateProviderResponse")
  String registerHealthUpdateProvider(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "healthUpdateInfo", targetNamespace = "urn:vim25") List<HealthUpdateInfo> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnregisterHealthUpdateProvider", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnregisterHealthUpdateProvider", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterHealthUpdateProviderRequestType")
  @ResponseWrapper(localName = "UnregisterHealthUpdateProviderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterHealthUpdateProviderResponse")
  void unregisterHealthUpdateProvider(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryProviderList", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryProviderList", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProviderListRequestType")
  @ResponseWrapper(localName = "QueryProviderListResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProviderListResponse")
  List<String> queryProviderList(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HasProvider", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HasProvider", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasProviderRequestType")
  @ResponseWrapper(localName = "HasProviderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasProviderResponse")
  boolean hasProvider(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryProviderName", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryProviderName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProviderNameRequestType")
  @ResponseWrapper(localName = "QueryProviderNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProviderNameResponse")
  String queryProviderName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHealthUpdateInfos", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHealthUpdateInfos", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHealthUpdateInfosRequestType")
  @ResponseWrapper(localName = "QueryHealthUpdateInfosResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHealthUpdateInfosResponse")
  List<HealthUpdateInfo> queryHealthUpdateInfos(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddMonitoredEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddMonitoredEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddMonitoredEntitiesRequestType")
  @ResponseWrapper(localName = "AddMonitoredEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddMonitoredEntitiesResponse")
  void addMonitoredEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveMonitoredEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveMonitoredEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveMonitoredEntitiesRequestType")
  @ResponseWrapper(localName = "RemoveMonitoredEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveMonitoredEntitiesResponse")
  void removeMonitoredEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryMonitoredEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryMonitoredEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMonitoredEntitiesRequestType")
  @ResponseWrapper(localName = "QueryMonitoredEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMonitoredEntitiesResponse")
  List<ManagedObjectReference> queryMonitoredEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HasMonitoredEntity", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HasMonitoredEntity", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasMonitoredEntityRequestType")
  @ResponseWrapper(localName = "HasMonitoredEntityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HasMonitoredEntityResponse")
  boolean hasMonitoredEntity(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryUnmonitoredHosts", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryUnmonitoredHosts", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnmonitoredHostsRequestType")
  @ResponseWrapper(localName = "QueryUnmonitoredHostsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnmonitoredHostsResponse")
  List<ManagedObjectReference> queryUnmonitoredHosts(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PostHealthUpdates", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "PostHealthUpdates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PostHealthUpdatesRequestType")
  @ResponseWrapper(localName = "PostHealthUpdatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PostHealthUpdatesResponse")
  void postHealthUpdates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "updates", targetNamespace = "urn:vim25") List<HealthUpdate> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHealthUpdates", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHealthUpdates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHealthUpdatesRequestType")
  @ResponseWrapper(localName = "QueryHealthUpdatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHealthUpdatesResponse")
  List<HealthUpdate> queryHealthUpdates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddFilter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddFilterRequestType")
  @ResponseWrapper(localName = "AddFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddFilterResponse")
  String addFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "filterName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "infoIds", targetNamespace = "urn:vim25") List<String> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFilterList", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFilterList", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterListRequestType")
  @ResponseWrapper(localName = "QueryFilterListResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterListResponse")
  List<String> queryFilterList(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "providerId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFilterName", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFilterName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterNameRequestType")
  @ResponseWrapper(localName = "QueryFilterNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterNameResponse")
  String queryFilterName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFilterInfoIds", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFilterInfoIds", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterInfoIdsRequestType")
  @ResponseWrapper(localName = "QueryFilterInfoIdsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterInfoIdsResponse")
  List<String> queryFilterInfoIds(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFilterEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFilterEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterEntitiesRequestType")
  @ResponseWrapper(localName = "QueryFilterEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFilterEntitiesResponse")
  List<ManagedObjectReference> queryFilterEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddFilterEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddFilterEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddFilterEntitiesRequestType")
  @ResponseWrapper(localName = "AddFilterEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddFilterEntitiesResponse")
  void addFilterEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveFilterEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveFilterEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveFilterEntitiesRequestType")
  @ResponseWrapper(localName = "RemoveFilterEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveFilterEntitiesResponse")
  void removeFilterEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "entities", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveFilter", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveFilterRequestType")
  @ResponseWrapper(localName = "RemoveFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveFilterResponse")
  void removeFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetCollectorPageSize", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetCollectorPageSize", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCollectorPageSizeRequestType")
  @ResponseWrapper(localName = "SetCollectorPageSizeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetCollectorPageSizeResponse")
  void setCollectorPageSize(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maxCount", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RewindCollector", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RewindCollector", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RewindCollectorRequestType")
  @ResponseWrapper(localName = "RewindCollectorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RewindCollectorResponse")
  void rewindCollector(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetCollector", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetCollector", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetCollectorRequestType")
  @ResponseWrapper(localName = "ResetCollectorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetCollectorResponse")
  void resetCollector(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyCollector", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyCollector", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyCollectorRequestType")
  @ResponseWrapper(localName = "DestroyCollectorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyCollectorResponse")
  void destroyCollector(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryTpmAttestationReport", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryTpmAttestationReport", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryTpmAttestationReportRequestType")
  @ResponseWrapper(localName = "QueryTpmAttestationReportResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryTpmAttestationReportResponse")
  HostTpmAttestationReport queryTpmAttestationReport(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHostConnectionInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHostConnectionInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostConnectionInfoRequestType")
  @ResponseWrapper(localName = "QueryHostConnectionInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostConnectionInfoResponse")
  HostConnectInfo queryHostConnectionInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateSystemResources", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateSystemResources", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemResourcesRequestType")
  @ResponseWrapper(localName = "UpdateSystemResourcesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemResourcesResponse")
  void updateSystemResources(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "resourceInfo", targetNamespace = "urn:vim25") HostSystemResourceInfo paramHostSystemResourceInfo) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateSystemSwapConfiguration", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateSystemSwapConfiguration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemSwapConfigurationRequestType")
  @ResponseWrapper(localName = "UpdateSystemSwapConfigurationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemSwapConfigurationResponse")
  void updateSystemSwapConfiguration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "sysSwapConfig", targetNamespace = "urn:vim25") HostSystemSwapConfiguration paramHostSystemSwapConfiguration) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconnectHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconnectHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconnectHostRequestType")
  @ResponseWrapper(localName = "ReconnectHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconnectHostTaskResponse")
  ManagedObjectReference reconnectHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cnxSpec", targetNamespace = "urn:vim25") HostConnectSpec paramHostConnectSpec, @WebParam(name = "reconnectSpec", targetNamespace = "urn:vim25") HostSystemReconnectSpec paramHostSystemReconnectSpec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisconnectHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DisconnectHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisconnectHostRequestType")
  @ResponseWrapper(localName = "DisconnectHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisconnectHostTaskResponse")
  ManagedObjectReference disconnectHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnterMaintenanceMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EnterMaintenanceMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnterMaintenanceModeRequestType")
  @ResponseWrapper(localName = "EnterMaintenanceMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnterMaintenanceModeTaskResponse")
  ManagedObjectReference enterMaintenanceModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "timeout", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "evacuatePoweredOffVms", targetNamespace = "urn:vim25") Boolean paramBoolean, @WebParam(name = "maintenanceSpec", targetNamespace = "urn:vim25") HostMaintenanceSpec paramHostMaintenanceSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "ExitMaintenanceMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExitMaintenanceMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExitMaintenanceModeRequestType")
  @ResponseWrapper(localName = "ExitMaintenanceMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExitMaintenanceModeTaskResponse")
  ManagedObjectReference exitMaintenanceModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "timeout", targetNamespace = "urn:vim25") int paramInt) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "RebootHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RebootHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RebootHostRequestType")
  @ResponseWrapper(localName = "RebootHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RebootHostTaskResponse")
  ManagedObjectReference rebootHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ShutdownHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ShutdownHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShutdownHostRequestType")
  @ResponseWrapper(localName = "ShutdownHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShutdownHostTaskResponse")
  ManagedObjectReference shutdownHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PowerDownHostToStandBy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerDownHostToStandBy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerDownHostToStandByRequestType")
  @ResponseWrapper(localName = "PowerDownHostToStandBy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerDownHostToStandByTaskResponse")
  ManagedObjectReference powerDownHostToStandByTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "timeoutSec", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "evacuatePoweredOffVms", targetNamespace = "urn:vim25") Boolean paramBoolean) throws HostPowerOpFailedFaultMsg, InvalidStateFaultMsg, NotSupportedFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "PowerUpHostFromStandBy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerUpHostFromStandBy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerUpHostFromStandByRequestType")
  @ResponseWrapper(localName = "PowerUpHostFromStandBy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerUpHostFromStandByTaskResponse")
  ManagedObjectReference powerUpHostFromStandByTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "timeoutSec", targetNamespace = "urn:vim25") int paramInt) throws HostPowerOpFailedFaultMsg, InvalidStateFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "QueryMemoryOverhead", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryMemoryOverhead", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMemoryOverheadRequestType")
  @ResponseWrapper(localName = "QueryMemoryOverheadResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMemoryOverheadResponse")
  long queryMemoryOverhead(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "memorySize", targetNamespace = "urn:vim25") long paramLong, @WebParam(name = "videoRamSize", targetNamespace = "urn:vim25") Integer paramInteger, @WebParam(name = "numVcpus", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryMemoryOverheadEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryMemoryOverheadEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMemoryOverheadExRequestType")
  @ResponseWrapper(localName = "QueryMemoryOverheadExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMemoryOverheadExResponse")
  long queryMemoryOverheadEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmConfigInfo", targetNamespace = "urn:vim25") VirtualMachineConfigInfo paramVirtualMachineConfigInfo) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureHostForDAS_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureHostForDAS_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureHostForDASRequestType")
  @ResponseWrapper(localName = "ReconfigureHostForDAS_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureHostForDASTaskResponse")
  ManagedObjectReference reconfigureHostForDASTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws DasConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateFlags", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateFlags", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateFlagsRequestType")
  @ResponseWrapper(localName = "UpdateFlagsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateFlagsResponse")
  void updateFlags(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "flagInfo", targetNamespace = "urn:vim25") HostFlagInfo paramHostFlagInfo) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnterLockdownMode", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnterLockdownMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnterLockdownModeRequestType")
  @ResponseWrapper(localName = "EnterLockdownModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnterLockdownModeResponse")
  void enterLockdownMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExitLockdownMode", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ExitLockdownMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExitLockdownModeRequestType")
  @ResponseWrapper(localName = "ExitLockdownModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExitLockdownModeResponse")
  void exitLockdownMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireCimServicesTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireCimServicesTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCimServicesTicketRequestType")
  @ResponseWrapper(localName = "AcquireCimServicesTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCimServicesTicketResponse")
  HostServiceTicket acquireCimServicesTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateIpmi", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateIpmi", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpmiRequestType")
  @ResponseWrapper(localName = "UpdateIpmiResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpmiResponse")
  void updateIpmi(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "ipmiInfo", targetNamespace = "urn:vim25") HostIpmiInfo paramHostIpmiInfo) throws InvalidIpmiLoginInfoFaultMsg, InvalidIpmiMacAddressFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveHardwareUptime", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveHardwareUptime", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHardwareUptimeRequestType")
  @ResponseWrapper(localName = "RetrieveHardwareUptimeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHardwareUptimeResponse")
  long retrieveHardwareUptime(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PrepareCrypto", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "PrepareCrypto", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PrepareCryptoRequestType")
  @ResponseWrapper(localName = "PrepareCryptoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PrepareCryptoResponse")
  void prepareCrypto(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableCrypto", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableCrypto", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableCryptoRequestType")
  @ResponseWrapper(localName = "EnableCryptoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableCryptoResponse")
  void enableCrypto(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keyPlain", targetNamespace = "urn:vim25") CryptoKeyPlain paramCryptoKeyPlain) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureCryptoKey", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ConfigureCryptoKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureCryptoKeyRequestType")
  @ResponseWrapper(localName = "ConfigureCryptoKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureCryptoKeyResponse")
  void configureCryptoKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keyId", targetNamespace = "urn:vim25") CryptoKeyId paramCryptoKeyId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryProductLockerLocation", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryProductLockerLocation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProductLockerLocationRequestType")
  @ResponseWrapper(localName = "QueryProductLockerLocationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProductLockerLocationResponse")
  String queryProductLockerLocation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateProductLockerLocation_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateProductLockerLocation_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateProductLockerLocationRequestType")
  @ResponseWrapper(localName = "UpdateProductLockerLocation_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateProductLockerLocationTaskResponse")
  ManagedObjectReference updateProductLockerLocationTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString) throws FileNotFoundFaultMsg, HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RetrieveFreeEpcMemory", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveFreeEpcMemory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveFreeEpcMemoryRequestType")
  @ResponseWrapper(localName = "RetrieveFreeEpcMemoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveFreeEpcMemoryResponse")
  long retrieveFreeEpcMemory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeaseGetManifest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HttpNfcLeaseGetManifest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseGetManifestRequestType")
  @ResponseWrapper(localName = "HttpNfcLeaseGetManifestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseGetManifestResponse")
  List<HttpNfcLeaseManifestEntry> httpNfcLeaseGetManifest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeaseSetManifestChecksumType", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HttpNfcLeaseSetManifestChecksumType", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseSetManifestChecksumTypeRequestType")
  @ResponseWrapper(localName = "HttpNfcLeaseSetManifestChecksumTypeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseSetManifestChecksumTypeResponse")
  void httpNfcLeaseSetManifestChecksumType(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "deviceUrlsToChecksumTypes", targetNamespace = "urn:vim25") List<KeyValue> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeaseComplete", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HttpNfcLeaseComplete", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseCompleteRequestType")
  @ResponseWrapper(localName = "HttpNfcLeaseCompleteResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseCompleteResponse")
  void httpNfcLeaseComplete(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeaseAbort", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HttpNfcLeaseAbort", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseAbortRequestType")
  @ResponseWrapper(localName = "HttpNfcLeaseAbortResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseAbortResponse")
  void httpNfcLeaseAbort(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "fault", targetNamespace = "urn:vim25") LocalizedMethodFault paramLocalizedMethodFault) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeaseProgress", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HttpNfcLeaseProgress", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseProgressRequestType")
  @ResponseWrapper(localName = "HttpNfcLeaseProgressResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeaseProgressResponse")
  void httpNfcLeaseProgress(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "percent", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg, TimedoutFaultMsg;
  
  @WebMethod(operationName = "HttpNfcLeasePullFromUrls_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HttpNfcLeasePullFromUrls_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeasePullFromUrlsRequestType")
  @ResponseWrapper(localName = "HttpNfcLeasePullFromUrls_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HttpNfcLeasePullFromUrlsTaskResponse")
  ManagedObjectReference httpNfcLeasePullFromUrlsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "files", targetNamespace = "urn:vim25") List<HttpNfcLeaseSourceFile> paramList) throws HttpFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SSLVerifyFaultFaultMsg;
  
  @WebMethod(operationName = "InstallIoFilter_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InstallIoFilter_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallIoFilterRequestType")
  @ResponseWrapper(localName = "InstallIoFilter_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallIoFilterTaskResponse")
  ManagedObjectReference installIoFilterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vibUrl", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UninstallIoFilter_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UninstallIoFilter_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallIoFilterRequestType")
  @ResponseWrapper(localName = "UninstallIoFilter_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallIoFilterTaskResponse")
  ManagedObjectReference uninstallIoFilterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FilterInUseFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeIoFilter_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpgradeIoFilter_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeIoFilterRequestType")
  @ResponseWrapper(localName = "UpgradeIoFilter_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeIoFilterTaskResponse")
  ManagedObjectReference upgradeIoFilterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "vibUrl", targetNamespace = "urn:vim25") String paramString2) throws InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryIoFilterIssues", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryIoFilterIssues", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIoFilterIssuesRequestType")
  @ResponseWrapper(localName = "QueryIoFilterIssuesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIoFilterIssuesResponse")
  IoFilterQueryIssueResult queryIoFilterIssues(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryIoFilterInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryIoFilterInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIoFilterInfoRequestType")
  @ResponseWrapper(localName = "QueryIoFilterInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIoFilterInfoResponse")
  List<ClusterIoFilterInfo> queryIoFilterInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResolveInstallationErrorsOnHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResolveInstallationErrorsOnHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveInstallationErrorsOnHostRequestType")
  @ResponseWrapper(localName = "ResolveInstallationErrorsOnHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveInstallationErrorsOnHostTaskResponse")
  ManagedObjectReference resolveInstallationErrorsOnHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResolveInstallationErrorsOnCluster_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResolveInstallationErrorsOnCluster_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveInstallationErrorsOnClusterRequestType")
  @ResponseWrapper(localName = "ResolveInstallationErrorsOnCluster_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveInstallationErrorsOnClusterTaskResponse")
  ManagedObjectReference resolveInstallationErrorsOnClusterTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDisksUsingFilter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDisksUsingFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDisksUsingFilterRequestType")
  @ResponseWrapper(localName = "QueryDisksUsingFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDisksUsingFilterResponse")
  List<VirtualDiskId> queryDisksUsingFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "filterId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "compRes", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryIpPools", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryIpPools", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIpPoolsRequestType")
  @ResponseWrapper(localName = "QueryIpPoolsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIpPoolsResponse")
  List<IpPool> queryIpPools(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateIpPool", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateIpPool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateIpPoolRequestType")
  @ResponseWrapper(localName = "CreateIpPoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateIpPoolResponse")
  int createIpPool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "pool", targetNamespace = "urn:vim25") IpPool paramIpPool) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateIpPool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateIpPool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpPoolRequestType")
  @ResponseWrapper(localName = "UpdateIpPoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpPoolResponse")
  void updateIpPool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "pool", targetNamespace = "urn:vim25") IpPool paramIpPool) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyIpPool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyIpPool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyIpPoolRequestType")
  @ResponseWrapper(localName = "DestroyIpPoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyIpPoolResponse")
  void destroyIpPool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "id", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AllocateIpv4Address", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AllocateIpv4Address", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AllocateIpv4AddressRequestType")
  @ResponseWrapper(localName = "AllocateIpv4AddressResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AllocateIpv4AddressResponse")
  String allocateIpv4Address(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "poolId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "allocationId", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AllocateIpv6Address", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AllocateIpv6Address", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AllocateIpv6AddressRequestType")
  @ResponseWrapper(localName = "AllocateIpv6AddressResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AllocateIpv6AddressResponse")
  String allocateIpv6Address(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "poolId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "allocationId", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReleaseIpAllocation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReleaseIpAllocation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseIpAllocationRequestType")
  @ResponseWrapper(localName = "ReleaseIpAllocationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseIpAllocationResponse")
  void releaseIpAllocation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "poolId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "allocationId", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryIPAllocations", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryIPAllocations", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIPAllocationsRequestType")
  @ResponseWrapper(localName = "QueryIPAllocationsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIPAllocationsResponse")
  List<IpPoolManagerIpAllocation> queryIPAllocations(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "dc", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "poolId", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateAssignedLicense", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateAssignedLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAssignedLicenseRequestType")
  @ResponseWrapper(localName = "UpdateAssignedLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAssignedLicenseResponse")
  LicenseManagerLicenseInfo updateAssignedLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "entityDisplayName", targetNamespace = "urn:vim25") String paramString3) throws LicenseEntityNotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveAssignedLicense", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveAssignedLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAssignedLicenseRequestType")
  @ResponseWrapper(localName = "RemoveAssignedLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAssignedLicenseResponse")
  void removeAssignedLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entityId", targetNamespace = "urn:vim25") String paramString) throws LicenseEntityNotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAssignedLicenses", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAssignedLicenses", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAssignedLicensesRequestType")
  @ResponseWrapper(localName = "QueryAssignedLicensesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAssignedLicensesResponse")
  List<LicenseAssignmentManagerLicenseAssignment> queryAssignedLicenses(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entityId", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QuerySupportedFeatures", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QuerySupportedFeatures", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySupportedFeaturesRequestType")
  @ResponseWrapper(localName = "QuerySupportedFeaturesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySupportedFeaturesResponse")
  List<LicenseFeatureInfo> querySupportedFeatures(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryLicenseSourceAvailability", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryLicenseSourceAvailability", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLicenseSourceAvailabilityRequestType")
  @ResponseWrapper(localName = "QueryLicenseSourceAvailabilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLicenseSourceAvailabilityResponse")
  List<LicenseAvailabilityInfo> queryLicenseSourceAvailability(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryLicenseUsage", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryLicenseUsage", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLicenseUsageRequestType")
  @ResponseWrapper(localName = "QueryLicenseUsageResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLicenseUsageResponse")
  LicenseUsageInfo queryLicenseUsage(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetLicenseEdition", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetLicenseEdition", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetLicenseEditionRequestType")
  @ResponseWrapper(localName = "SetLicenseEditionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetLicenseEditionResponse")
  void setLicenseEdition(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "featureKey", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckLicenseFeature", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckLicenseFeature", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckLicenseFeatureRequestType")
  @ResponseWrapper(localName = "CheckLicenseFeatureResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckLicenseFeatureResponse")
  boolean checkLicenseFeature(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "featureKey", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableFeature", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EnableFeature", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableFeatureRequestType")
  @ResponseWrapper(localName = "EnableFeatureResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableFeatureResponse")
  boolean enableFeature(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "featureKey", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableFeature", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DisableFeature", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableFeatureRequestType")
  @ResponseWrapper(localName = "DisableFeatureResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableFeatureResponse")
  boolean disableFeature(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "featureKey", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureLicenseSource", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ConfigureLicenseSource", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureLicenseSourceRequestType")
  @ResponseWrapper(localName = "ConfigureLicenseSourceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureLicenseSourceResponse")
  void configureLicenseSource(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "licenseSource", targetNamespace = "urn:vim25") LicenseSource paramLicenseSource) throws CannotAccessLocalSourceFaultMsg, InvalidLicenseFaultMsg, LicenseServerUnavailableFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateLicense", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLicenseRequestType")
  @ResponseWrapper(localName = "UpdateLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLicenseResponse")
  LicenseManagerLicenseInfo updateLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "labels", targetNamespace = "urn:vim25") List<KeyValue> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddLicense", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddLicenseRequestType")
  @ResponseWrapper(localName = "AddLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddLicenseResponse")
  LicenseManagerLicenseInfo addLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "labels", targetNamespace = "urn:vim25") List<KeyValue> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveLicense", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveLicenseRequestType")
  @ResponseWrapper(localName = "RemoveLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveLicenseResponse")
  void removeLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DecodeLicense", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DecodeLicense", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DecodeLicenseRequestType")
  @ResponseWrapper(localName = "DecodeLicenseResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DecodeLicenseResponse")
  LicenseManagerLicenseInfo decodeLicense(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateLicenseLabel", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateLicenseLabel", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLicenseLabelRequestType")
  @ResponseWrapper(localName = "UpdateLicenseLabelResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLicenseLabelResponse")
  void updateLicenseLabel(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "labelKey", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "labelValue", targetNamespace = "urn:vim25") String paramString3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveLicenseLabel", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveLicenseLabel", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveLicenseLabelRequestType")
  @ResponseWrapper(localName = "RemoveLicenseLabelResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveLicenseLabelResponse")
  void removeLicenseLabel(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "licenseKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "labelKey", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "Reload", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "Reload", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReloadRequestType")
  @ResponseWrapper(localName = "ReloadResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReloadResponse")
  void reload(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "Rename_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "Rename_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameRequestType")
  @ResponseWrapper(localName = "Rename_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameTaskResponse")
  ManagedObjectReference renameTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "newName", targetNamespace = "urn:vim25") String paramString) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "Destroy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "Destroy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyRequestType")
  @ResponseWrapper(localName = "Destroy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyTaskResponse")
  ManagedObjectReference destroyTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg, VimFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyNetwork", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyNetwork", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyNetworkRequestType")
  @ResponseWrapper(localName = "DestroyNetworkResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyNetworkResponse")
  void destroyNetwork(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LookupVmOverheadMemory", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LookupVmOverheadMemory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LookupVmOverheadMemoryRequestType")
  @ResponseWrapper(localName = "LookupVmOverheadMemoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LookupVmOverheadMemoryResponse")
  long lookupVmOverheadMemory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws InvalidArgumentFaultMsg, InvalidTypeFaultMsg, ManagedObjectNotFoundFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ValidateHost", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ValidateHost", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHostRequestType")
  @ResponseWrapper(localName = "ValidateHostResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHostResponse")
  OvfValidateHostResult validateHost(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "ovfDescriptor", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "vhp", targetNamespace = "urn:vim25") OvfValidateHostParams paramOvfValidateHostParams) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ParseDescriptor", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ParseDescriptor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ParseDescriptorRequestType")
  @ResponseWrapper(localName = "ParseDescriptorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ParseDescriptorResponse")
  OvfParseDescriptorResult parseDescriptor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "ovfDescriptor", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "pdp", targetNamespace = "urn:vim25") OvfParseDescriptorParams paramOvfParseDescriptorParams) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CreateImportSpec", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateImportSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateImportSpecRequestType")
  @ResponseWrapper(localName = "CreateImportSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateImportSpecResponse")
  OvfCreateImportSpecResult createImportSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "ovfDescriptor", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "resourcePool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "cisp", targetNamespace = "urn:vim25") OvfCreateImportSpecParams paramOvfCreateImportSpecParams) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDescriptor", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDescriptor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDescriptorRequestType")
  @ResponseWrapper(localName = "CreateDescriptorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDescriptorResponse")
  OvfCreateDescriptorResult createDescriptor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "obj", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "cdp", targetNamespace = "urn:vim25") OvfCreateDescriptorParams paramOvfCreateDescriptorParams) throws ConcurrentAccessFaultMsg, FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPerfProviderSummary", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPerfProviderSummary", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfProviderSummaryRequestType")
  @ResponseWrapper(localName = "QueryPerfProviderSummaryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfProviderSummaryResponse")
  PerfProviderSummary queryPerfProviderSummary(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailablePerfMetric", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailablePerfMetric", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailablePerfMetricRequestType")
  @ResponseWrapper(localName = "QueryAvailablePerfMetricResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailablePerfMetricResponse")
  List<PerfMetricId> queryAvailablePerfMetric(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "beginTime", targetNamespace = "urn:vim25") XMLGregorianCalendar paramXMLGregorianCalendar1, @WebParam(name = "endTime", targetNamespace = "urn:vim25") XMLGregorianCalendar paramXMLGregorianCalendar2, @WebParam(name = "intervalId", targetNamespace = "urn:vim25") Integer paramInteger) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPerfCounter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPerfCounter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCounterRequestType")
  @ResponseWrapper(localName = "QueryPerfCounterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCounterResponse")
  List<PerfCounterInfo> queryPerfCounter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "counterId", targetNamespace = "urn:vim25") List<Integer> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPerfCounterByLevel", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPerfCounterByLevel", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCounterByLevelRequestType")
  @ResponseWrapper(localName = "QueryPerfCounterByLevelResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCounterByLevelResponse")
  List<PerfCounterInfo> queryPerfCounterByLevel(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "level", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPerf", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPerf", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfRequestType")
  @ResponseWrapper(localName = "QueryPerfResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfResponse")
  List<PerfEntityMetricBase> queryPerf(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "querySpec", targetNamespace = "urn:vim25") List<PerfQuerySpec> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPerfComposite", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPerfComposite", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCompositeRequestType")
  @ResponseWrapper(localName = "QueryPerfCompositeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPerfCompositeResponse")
  PerfCompositeMetric queryPerfComposite(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "querySpec", targetNamespace = "urn:vim25") PerfQuerySpec paramPerfQuerySpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreatePerfInterval", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreatePerfInterval", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePerfIntervalRequestType")
  @ResponseWrapper(localName = "CreatePerfIntervalResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePerfIntervalResponse")
  void createPerfInterval(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "intervalId", targetNamespace = "urn:vim25") PerfInterval paramPerfInterval) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemovePerfInterval", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemovePerfInterval", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemovePerfIntervalRequestType")
  @ResponseWrapper(localName = "RemovePerfIntervalResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemovePerfIntervalResponse")
  void removePerfInterval(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "samplePeriod", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdatePerfInterval", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdatePerfInterval", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePerfIntervalRequestType")
  @ResponseWrapper(localName = "UpdatePerfIntervalResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePerfIntervalResponse")
  void updatePerfInterval(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "interval", targetNamespace = "urn:vim25") PerfInterval paramPerfInterval) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateCounterLevelMapping", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateCounterLevelMapping", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateCounterLevelMappingRequestType")
  @ResponseWrapper(localName = "UpdateCounterLevelMappingResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateCounterLevelMappingResponse")
  void updateCounterLevelMapping(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "counterLevelMap", targetNamespace = "urn:vim25") List<PerformanceManagerCounterLevelMapping> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetCounterLevelMapping", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetCounterLevelMapping", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetCounterLevelMappingRequestType")
  @ResponseWrapper(localName = "ResetCounterLevelMappingResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetCounterLevelMappingResponse")
  void resetCounterLevelMapping(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "counters", targetNamespace = "urn:vim25") List<Integer> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EstimateDatabaseSize", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EstimateDatabaseSize", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EstimateDatabaseSizeRequestType")
  @ResponseWrapper(localName = "EstimateDatabaseSizeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EstimateDatabaseSizeResponse")
  DatabaseSizeEstimate estimateDatabaseSize(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "dbSizeParam", targetNamespace = "urn:vim25") DatabaseSizeParam paramDatabaseSizeParam) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateConfigRequestType")
  @ResponseWrapper(localName = "UpdateConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateConfigResponse")
  void updateConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "config", targetNamespace = "urn:vim25") ResourceConfigSpec paramResourceConfigSpec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveIntoResourcePool", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MoveIntoResourcePool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoResourcePoolRequestType")
  @ResponseWrapper(localName = "MoveIntoResourcePoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveIntoResourcePoolResponse")
  void moveIntoResourcePool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "list", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateChildResourceConfiguration", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateChildResourceConfiguration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateChildResourceConfigurationRequestType")
  @ResponseWrapper(localName = "UpdateChildResourceConfigurationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateChildResourceConfigurationResponse")
  void updateChildResourceConfiguration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") List<ResourceConfigSpec> paramList) throws InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateResourcePool", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateResourcePool", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateResourcePoolRequestType")
  @ResponseWrapper(localName = "CreateResourcePoolResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateResourcePoolResponse")
  ManagedObjectReference createResourcePool(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") ResourceConfigSpec paramResourceConfigSpec) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyChildren", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyChildren", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyChildrenRequestType")
  @ResponseWrapper(localName = "DestroyChildrenResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyChildrenResponse")
  void destroyChildren(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateVApp", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateVApp", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVAppRequestType")
  @ResponseWrapper(localName = "CreateVAppResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVAppResponse")
  ManagedObjectReference createVApp(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "resSpec", targetNamespace = "urn:vim25") ResourceConfigSpec paramResourceConfigSpec, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") VAppConfigSpec paramVAppConfigSpec, @WebParam(name = "vmFolder", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws DuplicateNameFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CreateChildVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateChildVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateChildVMRequestType")
  @ResponseWrapper(localName = "CreateChildVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateChildVMTaskResponse")
  ManagedObjectReference createChildVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "config", targetNamespace = "urn:vim25") VirtualMachineConfigSpec paramVirtualMachineConfigSpec, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterChildVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RegisterChildVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterChildVMRequestType")
  @ResponseWrapper(localName = "RegisterChildVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterChildVMTaskResponse")
  ManagedObjectReference registerChildVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "ImportVApp", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ImportVApp", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportVAppRequestType")
  @ResponseWrapper(localName = "ImportVAppResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportVAppResponse")
  ManagedObjectReference importVApp(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "spec", targetNamespace = "urn:vim25") ImportSpec paramImportSpec, @WebParam(name = "folder", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "QueryResourceConfigOption", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryResourceConfigOption", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryResourceConfigOptionRequestType")
  @ResponseWrapper(localName = "QueryResourceConfigOptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryResourceConfigOptionResponse")
  ResourceConfigOption queryResourceConfigOption(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshRuntime", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshRuntime", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshRuntimeRequestType")
  @ResponseWrapper(localName = "RefreshRuntimeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshRuntimeResponse")
  void refreshRuntime(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindByUuid", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindByUuid", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByUuidRequestType")
  @ResponseWrapper(localName = "FindByUuidResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByUuidResponse")
  ManagedObjectReference findByUuid(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "uuid", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "instanceUuid", targetNamespace = "urn:vim25") Boolean paramBoolean1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindByDatastorePath", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindByDatastorePath", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByDatastorePathRequestType")
  @ResponseWrapper(localName = "FindByDatastorePathResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByDatastorePathResponse")
  ManagedObjectReference findByDatastorePath(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindByDnsName", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindByDnsName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByDnsNameRequestType")
  @ResponseWrapper(localName = "FindByDnsNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByDnsNameResponse")
  ManagedObjectReference findByDnsName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "dnsName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindByIp", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindByIp", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByIpRequestType")
  @ResponseWrapper(localName = "FindByIpResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByIpResponse")
  ManagedObjectReference findByIp(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "ip", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindByInventoryPath", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindByInventoryPath", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByInventoryPathRequestType")
  @ResponseWrapper(localName = "FindByInventoryPathResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindByInventoryPathResponse")
  ManagedObjectReference findByInventoryPath(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "inventoryPath", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindChild", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindChild", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindChildRequestType")
  @ResponseWrapper(localName = "FindChildResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindChildResponse")
  ManagedObjectReference findChild(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindAllByUuid", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindAllByUuid", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByUuidRequestType")
  @ResponseWrapper(localName = "FindAllByUuidResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByUuidResponse")
  List<ManagedObjectReference> findAllByUuid(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "uuid", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "instanceUuid", targetNamespace = "urn:vim25") Boolean paramBoolean1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindAllByDnsName", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindAllByDnsName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByDnsNameRequestType")
  @ResponseWrapper(localName = "FindAllByDnsNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByDnsNameResponse")
  List<ManagedObjectReference> findAllByDnsName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "dnsName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindAllByIp", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindAllByIp", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByIpRequestType")
  @ResponseWrapper(localName = "FindAllByIpResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAllByIpResponse")
  List<ManagedObjectReference> findAllByIp(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "ip", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmSearch", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CurrentTime", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CurrentTime", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CurrentTimeRequestType")
  @ResponseWrapper(localName = "CurrentTimeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CurrentTimeResponse")
  XMLGregorianCalendar currentTime(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveServiceContent", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveServiceContent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveServiceContentRequestType")
  @ResponseWrapper(localName = "RetrieveServiceContentResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveServiceContentResponse")
  ServiceContent retrieveServiceContent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ValidateMigration", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ValidateMigration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateMigrationRequestType")
  @ResponseWrapper(localName = "ValidateMigrationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateMigrationResponse")
  List<Event> validateMigration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "state", targetNamespace = "urn:vim25") VirtualMachinePowerState paramVirtualMachinePowerState, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVMotionCompatibility", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVMotionCompatibility", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVMotionCompatibilityRequestType")
  @ResponseWrapper(localName = "QueryVMotionCompatibilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVMotionCompatibilityResponse")
  List<HostVMotionCompatibility> queryVMotionCompatibility(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "compatibility", targetNamespace = "urn:vim25") List<String> paramList1) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveProductComponents", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveProductComponents", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveProductComponentsRequestType")
  @ResponseWrapper(localName = "RetrieveProductComponentsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveProductComponentsResponse")
  List<ProductComponentInfo> retrieveProductComponents(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryServiceList", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryServiceList", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryServiceListRequestType")
  @ResponseWrapper(localName = "QueryServiceListResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryServiceListResponse")
  List<ServiceManagerServiceInfo> queryServiceList(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "serviceName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "location", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateServiceMessage", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateServiceMessage", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServiceMessageRequestType")
  @ResponseWrapper(localName = "UpdateServiceMessageResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServiceMessageResponse")
  void updateServiceMessage(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "message", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LoginByToken", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LoginByToken", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginByTokenRequestType")
  @ResponseWrapper(localName = "LoginByTokenResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginByTokenResponse")
  UserSession loginByToken(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "Login", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "Login", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginRequestType")
  @ResponseWrapper(localName = "LoginResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginResponse")
  UserSession login(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString3) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LoginBySSPI", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LoginBySSPI", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginBySSPIRequestType")
  @ResponseWrapper(localName = "LoginBySSPIResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginBySSPIResponse")
  UserSession loginBySSPI(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "base64Token", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString2) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg, SSPIChallengeFaultMsg;
  
  @WebMethod(operationName = "Logout", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "Logout", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LogoutRequestType")
  @ResponseWrapper(localName = "LogoutResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LogoutResponse")
  void logout(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireLocalTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireLocalTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireLocalTicketRequestType")
  @ResponseWrapper(localName = "AcquireLocalTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireLocalTicketResponse")
  SessionManagerLocalTicket acquireLocalTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireGenericServiceTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireGenericServiceTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireGenericServiceTicketRequestType")
  @ResponseWrapper(localName = "AcquireGenericServiceTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireGenericServiceTicketResponse")
  SessionManagerGenericServiceTicket acquireGenericServiceTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") SessionManagerServiceRequestSpec paramSessionManagerServiceRequestSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "TerminateSession", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "TerminateSession", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateSessionRequestType")
  @ResponseWrapper(localName = "TerminateSessionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateSessionResponse")
  void terminateSession(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "sessionId", targetNamespace = "urn:vim25") List<String> paramList) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetLocale", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetLocale", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetLocaleRequestType")
  @ResponseWrapper(localName = "SetLocaleResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetLocaleResponse")
  void setLocale(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString) throws InvalidLocaleFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LoginExtensionBySubjectName", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LoginExtensionBySubjectName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginExtensionBySubjectNameRequestType")
  @ResponseWrapper(localName = "LoginExtensionBySubjectNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginExtensionBySubjectNameResponse")
  UserSession loginExtensionBySubjectName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString2) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, NoClientCertificateFaultMsg, NoSubjectNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LoginExtensionByCertificate", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LoginExtensionByCertificate", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginExtensionByCertificateRequestType")
  @ResponseWrapper(localName = "LoginExtensionByCertificateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LoginExtensionByCertificateResponse")
  UserSession loginExtensionByCertificate(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "extensionKey", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString2) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, NoClientCertificateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ImpersonateUser", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ImpersonateUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImpersonateUserRequestType")
  @ResponseWrapper(localName = "ImpersonateUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImpersonateUserResponse")
  UserSession impersonateUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "locale", targetNamespace = "urn:vim25") String paramString2) throws InvalidLocaleFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SessionIsActive", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "SessionIsActive", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SessionIsActiveRequestType")
  @ResponseWrapper(localName = "SessionIsActiveResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SessionIsActiveResponse")
  boolean sessionIsActive(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "sessionID", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireCloneTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireCloneTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCloneTicketRequestType")
  @ResponseWrapper(localName = "AcquireCloneTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCloneTicketResponse")
  String acquireCloneTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CloneSession", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CloneSession", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneSessionRequestType")
  @ResponseWrapper(localName = "CloneSessionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneSessionResponse")
  UserSession cloneSession(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cloneTicket", targetNamespace = "urn:vim25") String paramString) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExecuteSimpleCommand", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExecuteSimpleCommand", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExecuteSimpleCommandRequestType")
  @ResponseWrapper(localName = "ExecuteSimpleCommandResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExecuteSimpleCommandResponse")
  String executeSimpleCommand(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "arguments", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetSiteInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetSiteInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetSiteInfoRequestType")
  @ResponseWrapper(localName = "GetSiteInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetSiteInfoResponse")
  SiteInfo getSiteInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHostsWithAttachedLun", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHostsWithAttachedLun", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostsWithAttachedLunRequestType")
  @ResponseWrapper(localName = "QueryHostsWithAttachedLunResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostsWithAttachedLunResponse")
  List<ManagedObjectReference> queryHostsWithAttachedLun(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureDatastoreIORM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureDatastoreIORM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureDatastoreIORMRequestType")
  @ResponseWrapper(localName = "ConfigureDatastoreIORM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureDatastoreIORMTaskResponse")
  ManagedObjectReference configureDatastoreIORMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") StorageIORMConfigSpec paramStorageIORMConfigSpec) throws IORMNotSupportedHostOnDatastoreFaultMsg, InaccessibleDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryIORMConfigOption", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryIORMConfigOption", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIORMConfigOptionRequestType")
  @ResponseWrapper(localName = "QueryIORMConfigOptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryIORMConfigOptionResponse")
  StorageIORMConfigOption queryIORMConfigOption(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDatastorePerformanceSummary", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDatastorePerformanceSummary", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDatastorePerformanceSummaryRequestType")
  @ResponseWrapper(localName = "QueryDatastorePerformanceSummaryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDatastorePerformanceSummaryResponse")
  List<StoragePerformanceSummary> queryDatastorePerformanceSummary(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyStorageDrsRecommendationToPod_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ApplyStorageDrsRecommendationToPod_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyStorageDrsRecommendationToPodRequestType")
  @ResponseWrapper(localName = "ApplyStorageDrsRecommendationToPod_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyStorageDrsRecommendationToPodTaskResponse")
  ManagedObjectReference applyStorageDrsRecommendationToPodTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pod", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyStorageDrsRecommendation_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ApplyStorageDrsRecommendation_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyStorageDrsRecommendationRequestType")
  @ResponseWrapper(localName = "ApplyStorageDrsRecommendation_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyStorageDrsRecommendationTaskResponse")
  ManagedObjectReference applyStorageDrsRecommendationTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CancelStorageDrsRecommendation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CancelStorageDrsRecommendation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelStorageDrsRecommendationRequestType")
  @ResponseWrapper(localName = "CancelStorageDrsRecommendationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelStorageDrsRecommendationResponse")
  void cancelStorageDrsRecommendation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshStorageDrsRecommendation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshStorageDrsRecommendation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageDrsRecommendationRequestType")
  @ResponseWrapper(localName = "RefreshStorageDrsRecommendationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageDrsRecommendationResponse")
  void refreshStorageDrsRecommendation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pod", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshStorageDrsRecommendationsForPod_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RefreshStorageDrsRecommendationsForPod_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageDrsRecommendationsForPodRequestType")
  @ResponseWrapper(localName = "RefreshStorageDrsRecommendationsForPod_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageDrsRecommendationsForPodTaskResponse")
  ManagedObjectReference refreshStorageDrsRecommendationsForPodTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pod", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureStorageDrsForPod_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureStorageDrsForPod_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureStorageDrsForPodRequestType")
  @ResponseWrapper(localName = "ConfigureStorageDrsForPod_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureStorageDrsForPodTaskResponse")
  ManagedObjectReference configureStorageDrsForPodTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pod", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") StorageDrsConfigSpec paramStorageDrsConfigSpec, @WebParam(name = "modify", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ValidateStoragePodConfig", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ValidateStoragePodConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateStoragePodConfigRequestType")
  @ResponseWrapper(localName = "ValidateStoragePodConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateStoragePodConfigResponse")
  LocalizedMethodFault validateStoragePodConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pod", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") StorageDrsConfigSpec paramStorageDrsConfigSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RecommendDatastores", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RecommendDatastores", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommendDatastoresRequestType")
  @ResponseWrapper(localName = "RecommendDatastoresResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommendDatastoresResponse")
  StoragePlacementResult recommendDatastores(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "storageSpec", targetNamespace = "urn:vim25") StoragePlacementSpec paramStoragePlacementSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CancelTask", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CancelTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelTaskRequestType")
  @ResponseWrapper(localName = "CancelTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelTaskResponse")
  void cancelTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateProgress", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateProgress", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateProgressRequestType")
  @ResponseWrapper(localName = "UpdateProgressResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateProgressResponse")
  void updateProgress(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "percentDone", targetNamespace = "urn:vim25") int paramInt) throws InvalidStateFaultMsg, OutOfBoundsFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetTaskState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetTaskState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetTaskStateRequestType")
  @ResponseWrapper(localName = "SetTaskStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetTaskStateResponse")
  void setTaskState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "state", targetNamespace = "urn:vim25") TaskInfoState paramTaskInfoState, @WebParam(name = "result", targetNamespace = "urn:vim25") Object paramObject, @WebParam(name = "fault", targetNamespace = "urn:vim25") LocalizedMethodFault paramLocalizedMethodFault) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetTaskDescription", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetTaskDescription", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetTaskDescriptionRequestType")
  @ResponseWrapper(localName = "SetTaskDescriptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetTaskDescriptionResponse")
  void setTaskDescription(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "description", targetNamespace = "urn:vim25") LocalizableMessage paramLocalizableMessage) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReadNextTasks", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReadNextTasks", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadNextTasksRequestType")
  @ResponseWrapper(localName = "ReadNextTasksResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadNextTasksResponse")
  List<TaskInfo> readNextTasks(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maxCount", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReadPreviousTasks", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReadPreviousTasks", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadPreviousTasksRequestType")
  @ResponseWrapper(localName = "ReadPreviousTasksResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadPreviousTasksResponse")
  List<TaskInfo> readPreviousTasks(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maxCount", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateCollectorForTasks", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateCollectorForTasks", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCollectorForTasksRequestType")
  @ResponseWrapper(localName = "CreateCollectorForTasksResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCollectorForTasksResponse")
  ManagedObjectReference createCollectorForTasks(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filter", targetNamespace = "urn:vim25") TaskFilterSpec paramTaskFilterSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateTask", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTaskRequestType")
  @ResponseWrapper(localName = "CreateTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTaskResponse")
  TaskInfo createTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "obj", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "taskTypeId", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "initiatedBy", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "cancelable", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "parentTaskKey", targetNamespace = "urn:vim25") String paramString3, @WebParam(name = "activationId", targetNamespace = "urn:vim25") String paramString4) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveUserGroups", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveUserGroups", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveUserGroupsRequestType")
  @ResponseWrapper(localName = "RetrieveUserGroupsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveUserGroupsResponse")
  List<UserSearchResult> retrieveUserGroups(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "domain", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "searchStr", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "belongsToGroup", targetNamespace = "urn:vim25") String paramString3, @WebParam(name = "belongsToUser", targetNamespace = "urn:vim25") String paramString4, @WebParam(name = "exactMatch", targetNamespace = "urn:vim25") boolean paramBoolean1, @WebParam(name = "findUsers", targetNamespace = "urn:vim25") boolean paramBoolean2, @WebParam(name = "findGroups", targetNamespace = "urn:vim25") boolean paramBoolean3) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVAppConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateVAppConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVAppConfigRequestType")
  @ResponseWrapper(localName = "UpdateVAppConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVAppConfigResponse")
  void updateVAppConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VAppConfigSpec paramVAppConfigSpec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateLinkedChildren", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateLinkedChildren", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLinkedChildrenRequestType")
  @ResponseWrapper(localName = "UpdateLinkedChildrenResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLinkedChildrenResponse")
  void updateLinkedChildren(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "addChangeSet", targetNamespace = "urn:vim25") List<VirtualAppLinkInfo> paramList, @WebParam(name = "removeSet", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1) throws ConcurrentAccessFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CloneVApp_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CloneVApp_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVAppRequestType")
  @ResponseWrapper(localName = "CloneVApp_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVAppTaskResponse")
  ManagedObjectReference cloneVAppTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "target", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VAppCloneSpec paramVAppCloneSpec) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "ExportVApp", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExportVApp", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportVAppRequestType")
  @ResponseWrapper(localName = "ExportVAppResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportVAppResponse")
  ManagedObjectReference exportVApp(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "PowerOnVApp_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerOnVApp_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnVAppRequestType")
  @ResponseWrapper(localName = "PowerOnVApp_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnVAppTaskResponse")
  ManagedObjectReference powerOnVAppTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "PowerOffVApp_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerOffVApp_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOffVAppRequestType")
  @ResponseWrapper(localName = "PowerOffVApp_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOffVAppTaskResponse")
  ManagedObjectReference powerOffVAppTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg;
  
  @WebMethod(operationName = "SuspendVApp_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "SuspendVApp_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SuspendVAppRequestType")
  @ResponseWrapper(localName = "SuspendVApp_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SuspendVAppTaskResponse")
  ManagedObjectReference suspendVAppTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VAppConfigFaultFaultMsg;
  
  @WebMethod(operationName = "unregisterVApp_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "unregisterVApp_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterVAppRequestType")
  @ResponseWrapper(localName = "unregisterVApp_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterVAppTaskResponse")
  ManagedObjectReference unregisterVAppTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ConcurrentAccessFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVirtualDiskRequestType")
  @ResponseWrapper(localName = "CreateVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVirtualDiskTaskResponse")
  ManagedObjectReference createVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualDiskSpec paramVirtualDiskSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVirtualDiskRequestType")
  @ResponseWrapper(localName = "DeleteVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVirtualDiskTaskResponse")
  ManagedObjectReference deleteVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MoveVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MoveVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveVirtualDiskRequestType")
  @ResponseWrapper(localName = "MoveVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveVirtualDiskTaskResponse")
  ManagedObjectReference moveVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "sourceName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "sourceDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "destName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "destDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<VirtualMachineProfileSpec> paramList) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CopyVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CopyVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CopyVirtualDiskRequestType")
  @ResponseWrapper(localName = "CopyVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CopyVirtualDiskTaskResponse")
  ManagedObjectReference copyVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "sourceName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "sourceDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "destName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "destDatacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "destSpec", targetNamespace = "urn:vim25") VirtualDiskSpec paramVirtualDiskSpec, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidDiskFormatFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExtendVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExtendVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVirtualDiskRequestType")
  @ResponseWrapper(localName = "ExtendVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVirtualDiskTaskResponse")
  ManagedObjectReference extendVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "newCapacityKb", targetNamespace = "urn:vim25") long paramLong, @WebParam(name = "eagerZero", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVirtualDiskFragmentation", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVirtualDiskFragmentation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskFragmentationRequestType")
  @ResponseWrapper(localName = "QueryVirtualDiskFragmentationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskFragmentationResponse")
  int queryVirtualDiskFragmentation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DefragmentVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DefragmentVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DefragmentVirtualDiskRequestType")
  @ResponseWrapper(localName = "DefragmentVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DefragmentVirtualDiskTaskResponse")
  ManagedObjectReference defragmentVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ShrinkVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ShrinkVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShrinkVirtualDiskRequestType")
  @ResponseWrapper(localName = "ShrinkVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShrinkVirtualDiskTaskResponse")
  ManagedObjectReference shrinkVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "copy", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "InflateVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InflateVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InflateVirtualDiskRequestType")
  @ResponseWrapper(localName = "InflateVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InflateVirtualDiskTaskResponse")
  ManagedObjectReference inflateVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EagerZeroVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EagerZeroVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EagerZeroVirtualDiskRequestType")
  @ResponseWrapper(localName = "EagerZeroVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EagerZeroVirtualDiskTaskResponse")
  ManagedObjectReference eagerZeroVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ZeroFillVirtualDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ZeroFillVirtualDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ZeroFillVirtualDiskRequestType")
  @ResponseWrapper(localName = "ZeroFillVirtualDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ZeroFillVirtualDiskTaskResponse")
  ManagedObjectReference zeroFillVirtualDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetVirtualDiskUuid", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetVirtualDiskUuid", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetVirtualDiskUuidRequestType")
  @ResponseWrapper(localName = "SetVirtualDiskUuidResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetVirtualDiskUuidResponse")
  void setVirtualDiskUuid(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "uuid", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVirtualDiskUuid", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVirtualDiskUuid", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskUuidRequestType")
  @ResponseWrapper(localName = "QueryVirtualDiskUuidResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskUuidResponse")
  String queryVirtualDiskUuid(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVirtualDiskGeometry", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVirtualDiskGeometry", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskGeometryRequestType")
  @ResponseWrapper(localName = "QueryVirtualDiskGeometryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVirtualDiskGeometryResponse")
  HostDiskDimensionsChs queryVirtualDiskGeometry(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ImportUnmanagedSnapshot", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ImportUnmanagedSnapshot", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportUnmanagedSnapshotRequestType")
  @ResponseWrapper(localName = "ImportUnmanagedSnapshotResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportUnmanagedSnapshotResponse")
  void importUnmanagedSnapshot(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vdisk", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "vvolId", targetNamespace = "urn:vim25") String paramString2) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReleaseManagedSnapshot", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReleaseManagedSnapshot", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseManagedSnapshotRequestType")
  @ResponseWrapper(localName = "ReleaseManagedSnapshotResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseManagedSnapshotResponse")
  void releaseManagedSnapshot(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vdisk", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "datacenter", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileNotFoundFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshStorageInfo", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshStorageInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageInfoRequestType")
  @ResponseWrapper(localName = "RefreshStorageInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageInfoResponse")
  void refreshStorageInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSnapshotRequestType")
  @ResponseWrapper(localName = "CreateSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSnapshotTaskResponse")
  ManagedObjectReference createSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "memory", targetNamespace = "urn:vim25") boolean paramBoolean1, @WebParam(name = "quiesce", targetNamespace = "urn:vim25") boolean paramBoolean2) throws FileFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CreateSnapshotEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateSnapshotEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSnapshotExRequestType")
  @ResponseWrapper(localName = "CreateSnapshotEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSnapshotExTaskResponse")
  ManagedObjectReference createSnapshotExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "memory", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "quiesceSpec", targetNamespace = "urn:vim25") VirtualMachineGuestQuiesceSpec paramVirtualMachineGuestQuiesceSpec) throws FileFaultFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RevertToCurrentSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RevertToCurrentSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertToCurrentSnapshotRequestType")
  @ResponseWrapper(localName = "RevertToCurrentSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertToCurrentSnapshotTaskResponse")
  ManagedObjectReference revertToCurrentSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "suppressPowerOn", targetNamespace = "urn:vim25") Boolean paramBoolean) throws InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveAllSnapshots_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveAllSnapshots_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAllSnapshotsRequestType")
  @ResponseWrapper(localName = "RemoveAllSnapshots_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAllSnapshotsTaskResponse")
  ManagedObjectReference removeAllSnapshotsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "consolidate", targetNamespace = "urn:vim25") Boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ConsolidateVMDisks_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConsolidateVMDisks_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConsolidateVMDisksRequestType")
  @ResponseWrapper(localName = "ConsolidateVMDisks_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConsolidateVMDisksTaskResponse")
  ManagedObjectReference consolidateVMDisksTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "EstimateStorageForConsolidateSnapshots_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EstimateStorageForConsolidateSnapshots_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EstimateStorageForConsolidateSnapshotsRequestType")
  @ResponseWrapper(localName = "EstimateStorageForConsolidateSnapshots_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EstimateStorageForConsolidateSnapshotsTaskResponse")
  ManagedObjectReference estimateStorageForConsolidateSnapshotsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigVMRequestType")
  @ResponseWrapper(localName = "ReconfigVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigVMTaskResponse")
  ManagedObjectReference reconfigVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineConfigSpec paramVirtualMachineConfigSpec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpgradeVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVMRequestType")
  @ResponseWrapper(localName = "UpgradeVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVMTaskResponse")
  ManagedObjectReference upgradeVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "version", targetNamespace = "urn:vim25") String paramString) throws AlreadyUpgradedFaultMsg, InvalidStateFaultMsg, NoDiskFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ExtractOvfEnvironment", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExtractOvfEnvironment", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtractOvfEnvironmentRequestType")
  @ResponseWrapper(localName = "ExtractOvfEnvironmentResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtractOvfEnvironmentResponse")
  String extractOvfEnvironment(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PowerOnVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerOnVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnVMRequestType")
  @ResponseWrapper(localName = "PowerOnVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOnVMTaskResponse")
  ManagedObjectReference powerOnVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "PowerOffVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PowerOffVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOffVMRequestType")
  @ResponseWrapper(localName = "PowerOffVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PowerOffVMTaskResponse")
  ManagedObjectReference powerOffVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "SuspendVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "SuspendVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SuspendVMRequestType")
  @ResponseWrapper(localName = "SuspendVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SuspendVMTaskResponse")
  ManagedObjectReference suspendVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ResetVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResetVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetVMRequestType")
  @ResponseWrapper(localName = "ResetVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetVMTaskResponse")
  ManagedObjectReference resetVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ShutdownGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ShutdownGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShutdownGuestRequestType")
  @ResponseWrapper(localName = "ShutdownGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ShutdownGuestResponse")
  void shutdownGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg;
  
  @WebMethod(operationName = "RebootGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RebootGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RebootGuestRequestType")
  @ResponseWrapper(localName = "RebootGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RebootGuestResponse")
  void rebootGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg;
  
  @WebMethod(operationName = "StandbyGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "StandbyGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StandbyGuestRequestType")
  @ResponseWrapper(localName = "StandbyGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StandbyGuestResponse")
  void standbyGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg;
  
  @WebMethod(operationName = "AnswerVM", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AnswerVM", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AnswerVMRequestType")
  @ResponseWrapper(localName = "AnswerVMResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AnswerVMResponse")
  void answerVM(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "questionId", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "answerChoice", targetNamespace = "urn:vim25") String paramString2) throws ConcurrentAccessFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CustomizeVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CustomizeVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizeVMRequestType")
  @ResponseWrapper(localName = "CustomizeVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizeVMTaskResponse")
  ManagedObjectReference customizeVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") CustomizationSpec paramCustomizationSpec) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckCustomizationSpec", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CheckCustomizationSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCustomizationSpecRequestType")
  @ResponseWrapper(localName = "CheckCustomizationSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCustomizationSpecResponse")
  void checkCustomizationSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") CustomizationSpec paramCustomizationSpec) throws CustomizationFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MigrateVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MigrateVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MigrateVMRequestType")
  @ResponseWrapper(localName = "MigrateVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MigrateVMTaskResponse")
  ManagedObjectReference migrateVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "priority", targetNamespace = "urn:vim25") VirtualMachineMovePriority paramVirtualMachineMovePriority, @WebParam(name = "state", targetNamespace = "urn:vim25") VirtualMachinePowerState paramVirtualMachinePowerState) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RelocateVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RelocateVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RelocateVMRequestType")
  @ResponseWrapper(localName = "RelocateVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RelocateVMTaskResponse")
  ManagedObjectReference relocateVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec, @WebParam(name = "priority", targetNamespace = "urn:vim25") VirtualMachineMovePriority paramVirtualMachineMovePriority) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "CloneVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CloneVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVMRequestType")
  @ResponseWrapper(localName = "CloneVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVMTaskResponse")
  ManagedObjectReference cloneVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "folder", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineCloneSpec paramVirtualMachineCloneSpec) throws CustomizationFaultFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MigrationFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "InstantClone_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InstantClone_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstantCloneRequestType")
  @ResponseWrapper(localName = "InstantClone_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstantCloneTaskResponse")
  ManagedObjectReference instantCloneTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineInstantCloneSpec paramVirtualMachineInstantCloneSpec) throws DisallowedMigrationDeviceAttachedFaultMsg, FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ExportVm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExportVm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportVmRequestType")
  @ResponseWrapper(localName = "ExportVmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportVmResponse")
  ManagedObjectReference exportVm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "MarkAsTemplate", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkAsTemplate", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsTemplateRequestType")
  @ResponseWrapper(localName = "MarkAsTemplateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsTemplateResponse")
  void markAsTemplate(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "MarkAsVirtualMachine", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkAsVirtualMachine", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsVirtualMachineRequestType")
  @ResponseWrapper(localName = "MarkAsVirtualMachineResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsVirtualMachineResponse")
  void markAsVirtualMachine(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "UnregisterVM", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnregisterVM", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterVMRequestType")
  @ResponseWrapper(localName = "UnregisterVMResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterVMResponse")
  void unregisterVM(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidPowerStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ResetGuestInformation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetGuestInformation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetGuestInformationRequestType")
  @ResponseWrapper(localName = "ResetGuestInformationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetGuestInformationResponse")
  void resetGuestInformation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MountToolsInstaller", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MountToolsInstaller", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountToolsInstallerRequestType")
  @ResponseWrapper(localName = "MountToolsInstallerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountToolsInstallerResponse")
  void mountToolsInstaller(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg, VmToolsUpgradeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountToolsInstaller", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnmountToolsInstaller", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountToolsInstallerRequestType")
  @ResponseWrapper(localName = "UnmountToolsInstallerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountToolsInstallerResponse")
  void unmountToolsInstaller(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeTools_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpgradeTools_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeToolsRequestType")
  @ResponseWrapper(localName = "UpgradeTools_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeToolsTaskResponse")
  ManagedObjectReference upgradeToolsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "installerOptions", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, ToolsUnavailableFaultMsg, VmConfigFaultFaultMsg, VmToolsUpgradeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireMksTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireMksTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireMksTicketRequestType")
  @ResponseWrapper(localName = "AcquireMksTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireMksTicketResponse")
  VirtualMachineMksTicket acquireMksTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcquireTicket", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireTicket", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireTicketRequestType")
  @ResponseWrapper(localName = "AcquireTicketResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireTicketResponse")
  VirtualMachineTicket acquireTicket(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "ticketType", targetNamespace = "urn:vim25") String paramString) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetScreenResolution", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetScreenResolution", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetScreenResolutionRequestType")
  @ResponseWrapper(localName = "SetScreenResolutionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetScreenResolutionResponse")
  void setScreenResolution(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "width", targetNamespace = "urn:vim25") int paramInt1, @WebParam(name = "height", targetNamespace = "urn:vim25") int paramInt2) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, ToolsUnavailableFaultMsg;
  
  @WebMethod(operationName = "DefragmentAllDisks", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DefragmentAllDisks", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DefragmentAllDisksRequestType")
  @ResponseWrapper(localName = "DefragmentAllDisksResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DefragmentAllDisksResponse")
  void defragmentAllDisks(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateSecondaryVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateSecondaryVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSecondaryVMRequestType")
  @ResponseWrapper(localName = "CreateSecondaryVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSecondaryVMTaskResponse")
  ManagedObjectReference createSecondaryVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "CreateSecondaryVMEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateSecondaryVMEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSecondaryVMExRequestType")
  @ResponseWrapper(localName = "CreateSecondaryVMEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateSecondaryVMExTaskResponse")
  ManagedObjectReference createSecondaryVMExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") FaultToleranceConfigSpec paramFaultToleranceConfigSpec) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "TurnOffFaultToleranceForVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "TurnOffFaultToleranceForVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnOffFaultToleranceForVMRequestType")
  @ResponseWrapper(localName = "TurnOffFaultToleranceForVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnOffFaultToleranceForVMTaskResponse")
  ManagedObjectReference turnOffFaultToleranceForVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "MakePrimaryVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MakePrimaryVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakePrimaryVMRequestType")
  @ResponseWrapper(localName = "MakePrimaryVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakePrimaryVMTaskResponse")
  ManagedObjectReference makePrimaryVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "TerminateFaultTolerantVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "TerminateFaultTolerantVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateFaultTolerantVMRequestType")
  @ResponseWrapper(localName = "TerminateFaultTolerantVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateFaultTolerantVMTaskResponse")
  ManagedObjectReference terminateFaultTolerantVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "DisableSecondaryVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DisableSecondaryVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableSecondaryVMRequestType")
  @ResponseWrapper(localName = "DisableSecondaryVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableSecondaryVMTaskResponse")
  ManagedObjectReference disableSecondaryVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "EnableSecondaryVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EnableSecondaryVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableSecondaryVMRequestType")
  @ResponseWrapper(localName = "EnableSecondaryVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableSecondaryVMTaskResponse")
  ManagedObjectReference enableSecondaryVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg, VmFaultToleranceIssueFaultMsg;
  
  @WebMethod(operationName = "SetDisplayTopology", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetDisplayTopology", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetDisplayTopologyRequestType")
  @ResponseWrapper(localName = "SetDisplayTopologyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetDisplayTopologyResponse")
  void setDisplayTopology(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "displays", targetNamespace = "urn:vim25") List<VirtualMachineDisplayTopology> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, ToolsUnavailableFaultMsg;
  
  @WebMethod(operationName = "StartRecording_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StartRecording_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartRecordingRequestType")
  @ResponseWrapper(localName = "StartRecording_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartRecordingTaskResponse")
  ManagedObjectReference startRecordingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, HostIncompatibleForRecordReplayFaultMsg, InvalidNameFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RecordReplayDisabledFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "StopRecording_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StopRecording_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopRecordingRequestType")
  @ResponseWrapper(localName = "StopRecording_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopRecordingTaskResponse")
  ManagedObjectReference stopRecordingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "StartReplaying_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StartReplaying_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartReplayingRequestType")
  @ResponseWrapper(localName = "StartReplaying_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartReplayingTaskResponse")
  ManagedObjectReference startReplayingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "replaySnapshot", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, HostIncompatibleForRecordReplayFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RecordReplayDisabledFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "StopReplaying_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StopReplaying_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopReplayingRequestType")
  @ResponseWrapper(localName = "StopReplaying_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopReplayingTaskResponse")
  ManagedObjectReference stopReplayingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, SnapshotFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "PromoteDisks_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PromoteDisks_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PromoteDisksRequestType")
  @ResponseWrapper(localName = "PromoteDisks_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PromoteDisksTaskResponse")
  ManagedObjectReference promoteDisksTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "unlink", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "disks", targetNamespace = "urn:vim25") List<VirtualDisk> paramList) throws InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateScreenshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateScreenshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateScreenshotRequestType")
  @ResponseWrapper(localName = "CreateScreenshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateScreenshotTaskResponse")
  ManagedObjectReference createScreenshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "PutUsbScanCodes", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PutUsbScanCodes", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PutUsbScanCodesRequestType")
  @ResponseWrapper(localName = "PutUsbScanCodesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PutUsbScanCodesResponse")
  int putUsbScanCodes(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") UsbScanCodeSpec paramUsbScanCodeSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryChangedDiskAreas", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryChangedDiskAreas", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryChangedDiskAreasRequestType")
  @ResponseWrapper(localName = "QueryChangedDiskAreasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryChangedDiskAreasResponse")
  DiskChangeInfo queryChangedDiskAreas(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "snapshot", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "deviceKey", targetNamespace = "urn:vim25") int paramInt, @WebParam(name = "startOffset", targetNamespace = "urn:vim25") long paramLong, @WebParam(name = "changeId", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryUnownedFiles", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryUnownedFiles", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnownedFilesRequestType")
  @ResponseWrapper(localName = "QueryUnownedFilesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnownedFilesResponse")
  List<String> queryUnownedFiles(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "reloadVirtualMachineFromPath_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "reloadVirtualMachineFromPath_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReloadVirtualMachineFromPathRequestType")
  @ResponseWrapper(localName = "reloadVirtualMachineFromPath_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReloadVirtualMachineFromPathTaskResponse")
  ManagedObjectReference reloadVirtualMachineFromPathTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configurationPath", targetNamespace = "urn:vim25") String paramString) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidPowerStateFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFaultToleranceCompatibility", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFaultToleranceCompatibility", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFaultToleranceCompatibilityRequestType")
  @ResponseWrapper(localName = "QueryFaultToleranceCompatibilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFaultToleranceCompatibilityResponse")
  List<LocalizedMethodFault> queryFaultToleranceCompatibility(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFaultToleranceCompatibilityEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFaultToleranceCompatibilityEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFaultToleranceCompatibilityExRequestType")
  @ResponseWrapper(localName = "QueryFaultToleranceCompatibilityExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFaultToleranceCompatibilityExResponse")
  List<LocalizedMethodFault> queryFaultToleranceCompatibilityEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "forLegacyFt", targetNamespace = "urn:vim25") Boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "TerminateVM", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "TerminateVM", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateVMRequestType")
  @ResponseWrapper(localName = "TerminateVMResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateVMResponse")
  void terminateVM(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "SendNMI", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SendNMI", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SendNMIRequestType")
  @ResponseWrapper(localName = "SendNMIResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SendNMIResponse")
  void sendNMI(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AttachDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AttachDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachDiskRequestType")
  @ResponseWrapper(localName = "AttachDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachDiskTaskResponse")
  ManagedObjectReference attachDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "diskId", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "controllerKey", targetNamespace = "urn:vim25") Integer paramInteger1, @WebParam(name = "unitNumber", targetNamespace = "urn:vim25") Integer paramInteger2) throws DeviceUnsupportedForVmVersionFaultMsg, FileFaultFaultMsg, InvalidControllerFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, MissingControllerFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "DetachDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DetachDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachDiskRequestType")
  @ResponseWrapper(localName = "DetachDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachDiskTaskResponse")
  ManagedObjectReference detachDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "diskId", targetNamespace = "urn:vim25") ID paramID) throws FileFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyEvcModeVM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ApplyEvcModeVM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyEvcModeVMRequestType")
  @ResponseWrapper(localName = "ApplyEvcModeVM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyEvcModeVMTaskResponse")
  ManagedObjectReference applyEvcModeVMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mask", targetNamespace = "urn:vim25") List<HostFeatureMask> paramList, @WebParam(name = "completeMasks", targetNamespace = "urn:vim25") Boolean paramBoolean) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CryptoUnlock_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CryptoUnlock_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoUnlockRequestType")
  @ResponseWrapper(localName = "CryptoUnlock_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoUnlockTaskResponse")
  ManagedObjectReference cryptoUnlockTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, NotSupportedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PerformVsanUpgradePreflightCheck", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PerformVsanUpgradePreflightCheck", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformVsanUpgradePreflightCheckRequestType")
  @ResponseWrapper(localName = "PerformVsanUpgradePreflightCheckResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformVsanUpgradePreflightCheckResponse")
  VsanUpgradeSystemPreflightCheckResult performVsanUpgradePreflightCheck(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "downgradeFormat", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVsanUpgradeStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVsanUpgradeStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanUpgradeStatusRequestType")
  @ResponseWrapper(localName = "QueryVsanUpgradeStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanUpgradeStatusResponse")
  VsanUpgradeSystemUpgradeStatus queryVsanUpgradeStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "PerformVsanUpgrade_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "PerformVsanUpgrade_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformVsanUpgradeRequestType")
  @ResponseWrapper(localName = "PerformVsanUpgrade_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PerformVsanUpgradeTaskResponse")
  ManagedObjectReference performVsanUpgradeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "cluster", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "performObjectUpgrade", targetNamespace = "urn:vim25") Boolean paramBoolean1, @WebParam(name = "downgradeFormat", targetNamespace = "urn:vim25") Boolean paramBoolean2, @WebParam(name = "allowReducedRedundancy", targetNamespace = "urn:vim25") Boolean paramBoolean3, @WebParam(name = "excludeHosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveAlarm", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAlarmRequestType")
  @ResponseWrapper(localName = "RemoveAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveAlarmResponse")
  void removeAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureAlarm", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureAlarmRequestType")
  @ResponseWrapper(localName = "ReconfigureAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureAlarmResponse")
  void reconfigureAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") AlarmSpec paramAlarmSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateAlarm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateAlarmRequestType")
  @ResponseWrapper(localName = "CreateAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateAlarmResponse")
  ManagedObjectReference createAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") AlarmSpec paramAlarmSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetAlarm", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetAlarmRequestType")
  @ResponseWrapper(localName = "GetAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetAlarmResponse")
  List<ManagedObjectReference> getAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AreAlarmActionsEnabled", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AreAlarmActionsEnabled", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AreAlarmActionsEnabledRequestType")
  @ResponseWrapper(localName = "AreAlarmActionsEnabledResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AreAlarmActionsEnabledResponse")
  boolean areAlarmActionsEnabled(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableAlarmActions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableAlarmActions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableAlarmActionsRequestType")
  @ResponseWrapper(localName = "EnableAlarmActionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableAlarmActionsResponse")
  void enableAlarmActions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "enabled", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetAlarmState", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetAlarmState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetAlarmStateRequestType")
  @ResponseWrapper(localName = "GetAlarmStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetAlarmStateResponse")
  List<AlarmState> getAlarmState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AcknowledgeAlarm", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AcknowledgeAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcknowledgeAlarmRequestType")
  @ResponseWrapper(localName = "AcknowledgeAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcknowledgeAlarmResponse")
  void acknowledgeAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "alarm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClearTriggeredAlarms", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ClearTriggeredAlarms", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearTriggeredAlarmsRequestType")
  @ResponseWrapper(localName = "ClearTriggeredAlarmsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearTriggeredAlarmsResponse")
  void clearTriggeredAlarms(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filter", targetNamespace = "urn:vim25") AlarmFilterSpec paramAlarmFilterSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableAlarm", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableAlarmRequestType")
  @ResponseWrapper(localName = "DisableAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableAlarmResponse")
  void disableAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "alarm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableAlarm", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableAlarm", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableAlarmRequestType")
  @ResponseWrapper(localName = "EnableAlarmResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableAlarmResponse")
  void enableAlarm(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "alarm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureEvcMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureEvcMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureEvcModeRequestType")
  @ResponseWrapper(localName = "ConfigureEvcMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureEvcModeTaskResponse")
  ManagedObjectReference configureEvcModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "evcModeKey", targetNamespace = "urn:vim25") String paramString) throws EVCConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableEvcMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DisableEvcMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableEvcModeRequestType")
  @ResponseWrapper(localName = "DisableEvcMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableEvcModeTaskResponse")
  ManagedObjectReference disableEvcModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckConfigureEvcMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckConfigureEvcMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckConfigureEvcModeRequestType")
  @ResponseWrapper(localName = "CheckConfigureEvcMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckConfigureEvcModeTaskResponse")
  ManagedObjectReference checkConfigureEvcModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "evcModeKey", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckAddHostEvc_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckAddHostEvc_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckAddHostEvcRequestType")
  @ResponseWrapper(localName = "CheckAddHostEvc_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckAddHostEvcTaskResponse")
  ManagedObjectReference checkAddHostEvcTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cnxSpec", targetNamespace = "urn:vim25") HostConnectSpec paramHostConnectSpec) throws HostConnectFaultFaultMsg, InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureDVPortgroup_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigureDVPortgroup_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDVPortgroupRequestType")
  @ResponseWrapper(localName = "ReconfigureDVPortgroup_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDVPortgroupTaskResponse")
  ManagedObjectReference reconfigureDVPortgroupTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") DVPortgroupConfigSpec paramDVPortgroupConfigSpec) throws ConcurrentAccessFaultMsg, DuplicateNameFaultMsg, DvsFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DVPortgroupRollback_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DVPortgroupRollback_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVPortgroupRollbackRequestType")
  @ResponseWrapper(localName = "DVPortgroupRollback_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVPortgroupRollbackTaskResponse")
  ManagedObjectReference dvPortgroupRollbackTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entityBackup", targetNamespace = "urn:vim25") EntityBackupConfig paramEntityBackupConfig) throws DvsFaultFaultMsg, RollbackFailureFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailableDvsSpec", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailableDvsSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableDvsSpecRequestType")
  @ResponseWrapper(localName = "QueryAvailableDvsSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableDvsSpecResponse")
  List<DistributedVirtualSwitchProductSpec> queryAvailableDvsSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "recommended", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryCompatibleHostForNewDvs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryCompatibleHostForNewDvs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCompatibleHostForNewDvsRequestType")
  @ResponseWrapper(localName = "QueryCompatibleHostForNewDvsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCompatibleHostForNewDvsResponse")
  List<ManagedObjectReference> queryCompatibleHostForNewDvs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "container", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "switchProductSpec", targetNamespace = "urn:vim25") DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryCompatibleHostForExistingDvs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryCompatibleHostForExistingDvs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCompatibleHostForExistingDvsRequestType")
  @ResponseWrapper(localName = "QueryCompatibleHostForExistingDvsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCompatibleHostForExistingDvsResponse")
  List<ManagedObjectReference> queryCompatibleHostForExistingDvs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "container", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "dvs", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDvsCompatibleHostSpec", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDvsCompatibleHostSpec", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsCompatibleHostSpecRequestType")
  @ResponseWrapper(localName = "QueryDvsCompatibleHostSpecResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsCompatibleHostSpecResponse")
  List<DistributedVirtualSwitchHostProductSpec> queryDvsCompatibleHostSpec(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "switchProductSpec", targetNamespace = "urn:vim25") DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDvsFeatureCapability", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDvsFeatureCapability", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsFeatureCapabilityRequestType")
  @ResponseWrapper(localName = "QueryDvsFeatureCapabilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsFeatureCapabilityResponse")
  DVSFeatureCapability queryDvsFeatureCapability(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "switchProductSpec", targetNamespace = "urn:vim25") DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDvsByUuid", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDvsByUuid", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsByUuidRequestType")
  @ResponseWrapper(localName = "QueryDvsByUuidResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsByUuidResponse")
  ManagedObjectReference queryDvsByUuid(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuid", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDvsConfigTarget", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDvsConfigTarget", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsConfigTargetRequestType")
  @ResponseWrapper(localName = "QueryDvsConfigTargetResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsConfigTargetResponse")
  DVSManagerDvsConfigTarget queryDvsConfigTarget(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "dvs", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDvsCheckCompatibility", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDvsCheckCompatibility", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsCheckCompatibilityRequestType")
  @ResponseWrapper(localName = "QueryDvsCheckCompatibilityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDvsCheckCompatibilityResponse")
  List<DistributedVirtualSwitchManagerCompatibilityResult> queryDvsCheckCompatibility(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostContainer", targetNamespace = "urn:vim25") DistributedVirtualSwitchManagerHostContainer paramDistributedVirtualSwitchManagerHostContainer, @WebParam(name = "dvsProductSpec", targetNamespace = "urn:vim25") DistributedVirtualSwitchManagerDvsProductSpec paramDistributedVirtualSwitchManagerDvsProductSpec, @WebParam(name = "hostFilterSpec", targetNamespace = "urn:vim25") List<DistributedVirtualSwitchManagerHostDvsFilterSpec> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RectifyDvsOnHost_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RectifyDvsOnHost_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RectifyDvsOnHostRequestType")
  @ResponseWrapper(localName = "RectifyDvsOnHost_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RectifyDvsOnHostTaskResponse")
  ManagedObjectReference rectifyDvsOnHostTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DVSManagerExportEntity_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DVSManagerExportEntity_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerExportEntityRequestType")
  @ResponseWrapper(localName = "DVSManagerExportEntity_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerExportEntityTaskResponse")
  ManagedObjectReference dvsManagerExportEntityTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "selectionSet", targetNamespace = "urn:vim25") List<SelectionSet> paramList) throws BackupBlobWriteFailureFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DVSManagerImportEntity_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DVSManagerImportEntity_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerImportEntityRequestType")
  @ResponseWrapper(localName = "DVSManagerImportEntity_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerImportEntityTaskResponse")
  ManagedObjectReference dvsManagerImportEntityTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entityBackup", targetNamespace = "urn:vim25") List<EntityBackupConfig> paramList, @WebParam(name = "importType", targetNamespace = "urn:vim25") String paramString) throws DvsFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DVSManagerLookupDvPortGroup", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DVSManagerLookupDvPortGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerLookupDvPortGroupRequestType")
  @ResponseWrapper(localName = "DVSManagerLookupDvPortGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DVSManagerLookupDvPortGroupResponse")
  ManagedObjectReference dvsManagerLookupDvPortGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "switchUuid", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "portgroupKey", targetNamespace = "urn:vim25") String paramString2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDVSLacpGroupConfig_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateDVSLacpGroupConfig_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDVSLacpGroupConfigRequestType")
  @ResponseWrapper(localName = "UpdateDVSLacpGroupConfig_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDVSLacpGroupConfigTaskResponse")
  ManagedObjectReference updateDVSLacpGroupConfigTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lacpGroupSpec", targetNamespace = "urn:vim25") List<VMwareDvsLacpGroupSpec> paramList) throws DvsFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddKey", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddKeyRequestType")
  @ResponseWrapper(localName = "AddKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddKeyResponse")
  void addKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") CryptoKeyPlain paramCryptoKeyPlain) throws AlreadyExistsFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddKeys", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddKeys", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddKeysRequestType")
  @ResponseWrapper(localName = "AddKeysResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddKeysResponse")
  List<CryptoKeyResult> addKeys(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keys", targetNamespace = "urn:vim25") List<CryptoKeyPlain> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveKey", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKeyRequestType")
  @ResponseWrapper(localName = "RemoveKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKeyResponse")
  void removeKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") CryptoKeyId paramCryptoKeyId, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveKeys", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveKeys", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKeysRequestType")
  @ResponseWrapper(localName = "RemoveKeysResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKeysResponse")
  List<CryptoKeyResult> removeKeys(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keys", targetNamespace = "urn:vim25") List<CryptoKeyId> paramList, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListKeys", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListKeys", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKeysRequestType")
  @ResponseWrapper(localName = "ListKeysResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKeysResponse")
  List<CryptoKeyId> listKeys(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "limit", targetNamespace = "urn:vim25") Integer paramInteger) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CryptoManagerHostPrepare", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CryptoManagerHostPrepare", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostPrepareRequestType")
  @ResponseWrapper(localName = "CryptoManagerHostPrepareResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostPrepareResponse")
  void cryptoManagerHostPrepare(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CryptoManagerHostEnable", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CryptoManagerHostEnable", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostEnableRequestType")
  @ResponseWrapper(localName = "CryptoManagerHostEnableResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostEnableResponse")
  void cryptoManagerHostEnable(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "initialKey", targetNamespace = "urn:vim25") CryptoKeyPlain paramCryptoKeyPlain) throws AlreadyExistsFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ChangeKey_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ChangeKey_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeKeyRequestType")
  @ResponseWrapper(localName = "ChangeKey_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeKeyTaskResponse")
  ManagedObjectReference changeKeyTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "newKey", targetNamespace = "urn:vim25") CryptoKeyPlain paramCryptoKeyPlain) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CryptoManagerHostDisable", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CryptoManagerHostDisable", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostDisableRequestType")
  @ResponseWrapper(localName = "CryptoManagerHostDisableResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CryptoManagerHostDisableResponse")
  void cryptoManagerHostDisable(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterKmipServer", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RegisterKmipServer", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterKmipServerRequestType")
  @ResponseWrapper(localName = "RegisterKmipServerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterKmipServerResponse")
  void registerKmipServer(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "server", targetNamespace = "urn:vim25") KmipServerSpec paramKmipServerSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkDefault", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkDefault", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkDefaultRequestType")
  @ResponseWrapper(localName = "MarkDefaultResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkDefaultResponse")
  void markDefault(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusterId", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateKmipServer", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateKmipServer", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateKmipServerRequestType")
  @ResponseWrapper(localName = "UpdateKmipServerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateKmipServerResponse")
  void updateKmipServer(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "server", targetNamespace = "urn:vim25") KmipServerSpec paramKmipServerSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveKmipServer", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveKmipServer", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKmipServerRequestType")
  @ResponseWrapper(localName = "RemoveKmipServerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveKmipServerResponse")
  void removeKmipServer(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusterId", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "serverName", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListKmipServers", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListKmipServers", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKmipServersRequestType")
  @ResponseWrapper(localName = "ListKmipServersResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKmipServersResponse")
  List<KmipClusterInfo> listKmipServers(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "limit", targetNamespace = "urn:vim25") Integer paramInteger) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveKmipServersStatus_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveKmipServersStatus_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveKmipServersStatusRequestType")
  @ResponseWrapper(localName = "RetrieveKmipServersStatus_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveKmipServersStatusTaskResponse")
  ManagedObjectReference retrieveKmipServersStatusTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusters", targetNamespace = "urn:vim25") List<KmipClusterInfo> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateKey", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateKey", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateKeyRequestType")
  @ResponseWrapper(localName = "GenerateKeyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateKeyResponse")
  CryptoKeyResult generateKey(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keyProvider", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveKmipServerCert", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveKmipServerCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveKmipServerCertRequestType")
  @ResponseWrapper(localName = "RetrieveKmipServerCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveKmipServerCertResponse")
  CryptoManagerKmipServerCertInfo retrieveKmipServerCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keyProvider", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "server", targetNamespace = "urn:vim25") KmipServerInfo paramKmipServerInfo) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UploadKmipServerCert", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UploadKmipServerCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UploadKmipServerCertRequestType")
  @ResponseWrapper(localName = "UploadKmipServerCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UploadKmipServerCertResponse")
  void uploadKmipServerCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "certificate", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateSelfSignedClientCert", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateSelfSignedClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateSelfSignedClientCertRequestType")
  @ResponseWrapper(localName = "GenerateSelfSignedClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateSelfSignedClientCertResponse")
  String generateSelfSignedClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateClientCsr", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateClientCsr", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateClientCsrRequestType")
  @ResponseWrapper(localName = "GenerateClientCsrResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateClientCsrResponse")
  String generateClientCsr(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveSelfSignedClientCert", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveSelfSignedClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSelfSignedClientCertRequestType")
  @ResponseWrapper(localName = "RetrieveSelfSignedClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSelfSignedClientCertResponse")
  String retrieveSelfSignedClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveClientCsr", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveClientCsr", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveClientCsrRequestType")
  @ResponseWrapper(localName = "RetrieveClientCsrResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveClientCsrResponse")
  String retrieveClientCsr(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveClientCert", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveClientCertRequestType")
  @ResponseWrapper(localName = "RetrieveClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveClientCertResponse")
  String retrieveClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateSelfSignedClientCert", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateSelfSignedClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSelfSignedClientCertRequestType")
  @ResponseWrapper(localName = "UpdateSelfSignedClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSelfSignedClientCertResponse")
  void updateSelfSignedClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "certificate", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateKmsSignedCsrClientCert", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateKmsSignedCsrClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateKmsSignedCsrClientCertRequestType")
  @ResponseWrapper(localName = "UpdateKmsSignedCsrClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateKmsSignedCsrClientCertResponse")
  void updateKmsSignedCsrClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "certificate", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UploadClientCert", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UploadClientCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UploadClientCertRequestType")
  @ResponseWrapper(localName = "UploadClientCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UploadClientCertResponse")
  void uploadClientCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "certificate", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "privateKey", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "IsKmsClusterActive", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "IsKmsClusterActive", targetNamespace = "urn:vim25", className = "com.vmware.vim25.IsKmsClusterActiveRequestType")
  @ResponseWrapper(localName = "IsKmsClusterActiveResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.IsKmsClusterActiveResponse")
  boolean isKmsClusterActive(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cluster", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetDefaultKmsCluster", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetDefaultKmsCluster", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetDefaultKmsClusterRequestType")
  @ResponseWrapper(localName = "SetDefaultKmsClusterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetDefaultKmsClusterResponse")
  void setDefaultKmsCluster(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "clusterId", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetDefaultKmsCluster", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetDefaultKmsCluster", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetDefaultKmsClusterRequestType")
  @ResponseWrapper(localName = "GetDefaultKmsClusterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetDefaultKmsClusterResponse")
  KeyProviderId getDefaultKmsCluster(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "defaultsToParent", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryCryptoKeyStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryCryptoKeyStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCryptoKeyStatusRequestType")
  @ResponseWrapper(localName = "QueryCryptoKeyStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCryptoKeyStatusResponse")
  List<CryptoManagerKmipCryptoKeyStatus> queryCryptoKeyStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "keyIds", targetNamespace = "urn:vim25") List<CryptoKeyId> paramList, @WebParam(name = "checkKeyBitMap", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterKmsCluster", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RegisterKmsCluster", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterKmsClusterRequestType")
  @ResponseWrapper(localName = "RegisterKmsClusterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterKmsClusterResponse")
  void registerKmsCluster(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusterId", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId, @WebParam(name = "managementType", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnregisterKmsCluster", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnregisterKmsCluster", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterKmsClusterRequestType")
  @ResponseWrapper(localName = "UnregisterKmsClusterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnregisterKmsClusterResponse")
  void unregisterKmsCluster(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "clusterId", targetNamespace = "urn:vim25") KeyProviderId paramKeyProviderId) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListKmsClusters", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListKmsClusters", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKmsClustersRequestType")
  @ResponseWrapper(localName = "ListKmsClustersResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListKmsClustersResponse")
  List<KmipClusterInfo> listKmsClusters(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "includeKmsServers", targetNamespace = "urn:vim25") Boolean paramBoolean, @WebParam(name = "managementTypeFilter", targetNamespace = "urn:vim25") Integer paramInteger1, @WebParam(name = "statusFilter", targetNamespace = "urn:vim25") Integer paramInteger2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReadNextEvents", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReadNextEvents", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadNextEventsRequestType")
  @ResponseWrapper(localName = "ReadNextEventsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadNextEventsResponse")
  List<Event> readNextEvents(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maxCount", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReadPreviousEvents", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReadPreviousEvents", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadPreviousEventsRequestType")
  @ResponseWrapper(localName = "ReadPreviousEventsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadPreviousEventsResponse")
  List<Event> readPreviousEvents(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maxCount", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveArgumentDescription", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveArgumentDescription", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveArgumentDescriptionRequestType")
  @ResponseWrapper(localName = "RetrieveArgumentDescriptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveArgumentDescriptionResponse")
  List<EventArgDesc> retrieveArgumentDescription(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "eventTypeId", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateCollectorForEvents", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateCollectorForEvents", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCollectorForEventsRequestType")
  @ResponseWrapper(localName = "CreateCollectorForEventsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateCollectorForEventsResponse")
  ManagedObjectReference createCollectorForEvents(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filter", targetNamespace = "urn:vim25") EventFilterSpec paramEventFilterSpec) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LogUserEvent", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "LogUserEvent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LogUserEventRequestType")
  @ResponseWrapper(localName = "LogUserEventResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LogUserEventResponse")
  void logUserEvent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "msg", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryEvents", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryEvents", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryEventsRequestType")
  @ResponseWrapper(localName = "QueryEventsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryEventsResponse")
  List<Event> queryEvents(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "filter", targetNamespace = "urn:vim25") EventFilterSpec paramEventFilterSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "PostEvent", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "PostEvent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PostEventRequestType")
  @ResponseWrapper(localName = "PostEventResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PostEventResponse")
  void postEvent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "eventToPost", targetNamespace = "urn:vim25") Event paramEvent, @WebParam(name = "taskInfo", targetNamespace = "urn:vim25") TaskInfo paramTaskInfo) throws InvalidEventFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "JoinDomain_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "JoinDomain_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.JoinDomainRequestType")
  @ResponseWrapper(localName = "JoinDomain_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.JoinDomainTaskResponse")
  ManagedObjectReference joinDomainTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "domainName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString3) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, InvalidLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "JoinDomainWithCAM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "JoinDomainWithCAM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.JoinDomainWithCAMRequestType")
  @ResponseWrapper(localName = "JoinDomainWithCAM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.JoinDomainWithCAMTaskResponse")
  ManagedObjectReference joinDomainWithCAMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "domainName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "camServer", targetNamespace = "urn:vim25") String paramString2) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ImportCertificateForCAM_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ImportCertificateForCAM_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportCertificateForCAMRequestType")
  @ResponseWrapper(localName = "ImportCertificateForCAM_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ImportCertificateForCAMTaskResponse")
  ManagedObjectReference importCertificateForCAMTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "certPath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "camServer", targetNamespace = "urn:vim25") String paramString2) throws ActiveDirectoryFaultFaultMsg, FileNotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "LeaveCurrentDomain_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "LeaveCurrentDomain_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LeaveCurrentDomainRequestType")
  @ResponseWrapper(localName = "LeaveCurrentDomain_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.LeaveCurrentDomainTaskResponse")
  ManagedObjectReference leaveCurrentDomainTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws ActiveDirectoryFaultFaultMsg, AuthMinimumAdminPermissionFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "EnableSmartCardAuthentication", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableSmartCardAuthentication", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableSmartCardAuthenticationRequestType")
  @ResponseWrapper(localName = "EnableSmartCardAuthenticationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableSmartCardAuthenticationResponse")
  void enableSmartCardAuthentication(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "InstallSmartCardTrustAnchor", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "InstallSmartCardTrustAnchor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallSmartCardTrustAnchorRequestType")
  @ResponseWrapper(localName = "InstallSmartCardTrustAnchorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallSmartCardTrustAnchorResponse")
  void installSmartCardTrustAnchor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cert", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReplaceSmartCardTrustAnchors", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReplaceSmartCardTrustAnchors", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReplaceSmartCardTrustAnchorsRequestType")
  @ResponseWrapper(localName = "ReplaceSmartCardTrustAnchorsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReplaceSmartCardTrustAnchorsResponse")
  void replaceSmartCardTrustAnchors(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "certs", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveSmartCardTrustAnchor", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveSmartCardTrustAnchor", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSmartCardTrustAnchorRequestType")
  @ResponseWrapper(localName = "RemoveSmartCardTrustAnchorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSmartCardTrustAnchorResponse")
  void removeSmartCardTrustAnchor(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "issuer", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "serial", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveSmartCardTrustAnchorByFingerprint", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveSmartCardTrustAnchorByFingerprint", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSmartCardTrustAnchorByFingerprintRequestType")
  @ResponseWrapper(localName = "RemoveSmartCardTrustAnchorByFingerprintResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSmartCardTrustAnchorByFingerprintResponse")
  void removeSmartCardTrustAnchorByFingerprint(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "fingerprint", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "digest", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListSmartCardTrustAnchors", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListSmartCardTrustAnchors", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListSmartCardTrustAnchorsRequestType")
  @ResponseWrapper(localName = "ListSmartCardTrustAnchorsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListSmartCardTrustAnchorsResponse")
  List<String> listSmartCardTrustAnchors(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableSmartCardAuthentication", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableSmartCardAuthentication", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableSmartCardAuthenticationRequestType")
  @ResponseWrapper(localName = "DisableSmartCardAuthenticationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableSmartCardAuthenticationResponse")
  void disableSmartCardAuthentication(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws ActiveDirectoryFaultFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DownloadDescriptionTree", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DownloadDescriptionTree", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DownloadDescriptionTreeRequestType")
  @ResponseWrapper(localName = "DownloadDescriptionTreeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DownloadDescriptionTreeResponse")
  byte[] downloadDescriptionTree(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveDynamicPassthroughInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveDynamicPassthroughInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDynamicPassthroughInfoRequestType")
  @ResponseWrapper(localName = "RetrieveDynamicPassthroughInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDynamicPassthroughInfoResponse")
  List<VirtualMachineDynamicPassthroughInfo> retrieveDynamicPassthroughInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateAssignableHardwareConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateAssignableHardwareConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAssignableHardwareConfigRequestType")
  @ResponseWrapper(localName = "UpdateAssignableHardwareConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAssignableHardwareConfigResponse")
  void updateAssignableHardwareConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostAssignableHardwareConfig paramHostAssignableHardwareConfig) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureAutostart", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureAutostart", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureAutostartRequestType")
  @ResponseWrapper(localName = "ReconfigureAutostartResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureAutostartResponse")
  void reconfigureAutostart(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostAutoStartManagerConfig paramHostAutoStartManagerConfig) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AutoStartPowerOn", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AutoStartPowerOn", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AutoStartPowerOnRequestType")
  @ResponseWrapper(localName = "AutoStartPowerOnResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AutoStartPowerOnResponse")
  void autoStartPowerOn(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AutoStartPowerOff", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AutoStartPowerOff", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AutoStartPowerOffRequestType")
  @ResponseWrapper(localName = "AutoStartPowerOffResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AutoStartPowerOffResponse")
  void autoStartPowerOff(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryBootDevices", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryBootDevices", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryBootDevicesRequestType")
  @ResponseWrapper(localName = "QueryBootDevicesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryBootDevicesResponse")
  HostBootDeviceInfo queryBootDevices(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateBootDevice", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateBootDevice", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateBootDeviceRequestType")
  @ResponseWrapper(localName = "UpdateBootDeviceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateBootDeviceResponse")
  void updateBootDevice(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureHostCache_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureHostCache_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureHostCacheRequestType")
  @ResponseWrapper(localName = "ConfigureHostCache_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureHostCacheTaskResponse")
  ManagedObjectReference configureHostCacheTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostCacheConfigurationSpec paramHostCacheConfigurationSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateCertificateSigningRequest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateCertificateSigningRequest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateCertificateSigningRequestRequestType")
  @ResponseWrapper(localName = "GenerateCertificateSigningRequestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateCertificateSigningRequestResponse")
  String generateCertificateSigningRequest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "useIpAddressAsCommonName", targetNamespace = "urn:vim25") boolean paramBoolean) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateCertificateSigningRequestByDn", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateCertificateSigningRequestByDn", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateCertificateSigningRequestByDnRequestType")
  @ResponseWrapper(localName = "GenerateCertificateSigningRequestByDnResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateCertificateSigningRequestByDnResponse")
  String generateCertificateSigningRequestByDn(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "distinguishedName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "InstallServerCertificate", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "InstallServerCertificate", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallServerCertificateRequestType")
  @ResponseWrapper(localName = "InstallServerCertificateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallServerCertificateResponse")
  void installServerCertificate(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cert", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReplaceCACertificatesAndCRLs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReplaceCACertificatesAndCRLs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReplaceCACertificatesAndCRLsRequestType")
  @ResponseWrapper(localName = "ReplaceCACertificatesAndCRLsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReplaceCACertificatesAndCRLsResponse")
  void replaceCACertificatesAndCRLs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "caCert", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "caCrl", targetNamespace = "urn:vim25") List<String> paramList2) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListCACertificates", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListCACertificates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListCACertificatesRequestType")
  @ResponseWrapper(localName = "ListCACertificatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListCACertificatesResponse")
  List<String> listCACertificates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListCACertificateRevocationLists", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListCACertificateRevocationLists", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListCACertificateRevocationListsRequestType")
  @ResponseWrapper(localName = "ListCACertificateRevocationListsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListCACertificateRevocationListsResponse")
  List<String> listCACertificateRevocationLists(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableHyperThreading", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableHyperThreading", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableHyperThreadingRequestType")
  @ResponseWrapper(localName = "EnableHyperThreadingResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableHyperThreadingResponse")
  void enableHyperThreading(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableHyperThreading", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableHyperThreading", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableHyperThreadingRequestType")
  @ResponseWrapper(localName = "DisableHyperThreadingResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableHyperThreadingResponse")
  void disableHyperThreading(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SearchDatastore_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "SearchDatastore_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SearchDatastoreRequestType")
  @ResponseWrapper(localName = "SearchDatastore_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SearchDatastoreTaskResponse")
  ManagedObjectReference searchDatastoreTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "datastorePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "searchSpec", targetNamespace = "urn:vim25") HostDatastoreBrowserSearchSpec paramHostDatastoreBrowserSearchSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SearchDatastoreSubFolders_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "SearchDatastoreSubFolders_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SearchDatastoreSubFoldersRequestType")
  @ResponseWrapper(localName = "SearchDatastoreSubFolders_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SearchDatastoreSubFoldersTaskResponse")
  ManagedObjectReference searchDatastoreSubFoldersTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "datastorePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "searchSpec", targetNamespace = "urn:vim25") HostDatastoreBrowserSearchSpec paramHostDatastoreBrowserSearchSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteFile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteFile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteFileRequestType")
  @ResponseWrapper(localName = "DeleteFileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteFileResponse")
  void deleteFile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "datastorePath", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateLocalSwapDatastore", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateLocalSwapDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLocalSwapDatastoreRequestType")
  @ResponseWrapper(localName = "UpdateLocalSwapDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLocalSwapDatastoreResponse")
  void updateLocalSwapDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws DatastoreNotWritableOnHostFaultMsg, InaccessibleDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailableDisksForVmfs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailableDisksForVmfs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableDisksForVmfsRequestType")
  @ResponseWrapper(localName = "QueryAvailableDisksForVmfsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableDisksForVmfsResponse")
  List<HostScsiDisk> queryAvailableDisksForVmfs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVmfsDatastoreCreateOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVmfsDatastoreCreateOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreCreateOptionsRequestType")
  @ResponseWrapper(localName = "QueryVmfsDatastoreCreateOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreCreateOptionsResponse")
  List<VmfsDatastoreOption> queryVmfsDatastoreCreateOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "vmfsMajorVersion", targetNamespace = "urn:vim25") Integer paramInteger) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateVmfsDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateVmfsDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVmfsDatastoreRequestType")
  @ResponseWrapper(localName = "CreateVmfsDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVmfsDatastoreResponse")
  ManagedObjectReference createVmfsDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VmfsDatastoreCreateSpec paramVmfsDatastoreCreateSpec) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVmfsDatastoreExtendOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVmfsDatastoreExtendOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreExtendOptionsRequestType")
  @ResponseWrapper(localName = "QueryVmfsDatastoreExtendOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreExtendOptionsResponse")
  List<VmfsDatastoreOption> queryVmfsDatastoreExtendOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "suppressExpandCandidates", targetNamespace = "urn:vim25") Boolean paramBoolean) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVmfsDatastoreExpandOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVmfsDatastoreExpandOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreExpandOptionsRequestType")
  @ResponseWrapper(localName = "QueryVmfsDatastoreExpandOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsDatastoreExpandOptionsResponse")
  List<VmfsDatastoreOption> queryVmfsDatastoreExpandOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExtendVmfsDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExtendVmfsDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVmfsDatastoreRequestType")
  @ResponseWrapper(localName = "ExtendVmfsDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVmfsDatastoreResponse")
  ManagedObjectReference extendVmfsDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VmfsDatastoreExtendSpec paramVmfsDatastoreExtendSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableClusteredVmdkSupport", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableClusteredVmdkSupport", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableClusteredVmdkSupportRequestType")
  @ResponseWrapper(localName = "EnableClusteredVmdkSupportResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableClusteredVmdkSupportResponse")
  void enableClusteredVmdkSupport(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableClusteredVmdkSupport", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableClusteredVmdkSupport", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableClusteredVmdkSupportRequestType")
  @ResponseWrapper(localName = "DisableClusteredVmdkSupportResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableClusteredVmdkSupportResponse")
  void disableClusteredVmdkSupport(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExpandVmfsDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExpandVmfsDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExpandVmfsDatastoreRequestType")
  @ResponseWrapper(localName = "ExpandVmfsDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExpandVmfsDatastoreResponse")
  ManagedObjectReference expandVmfsDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VmfsDatastoreExpandSpec paramVmfsDatastoreExpandSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateNasDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateNasDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNasDatastoreRequestType")
  @ResponseWrapper(localName = "CreateNasDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNasDatastoreResponse")
  ManagedObjectReference createNasDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostNasVolumeSpec paramHostNasVolumeSpec) throws AlreadyExistsFaultMsg, DuplicateNameFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateLocalDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateLocalDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateLocalDatastoreRequestType")
  @ResponseWrapper(localName = "CreateLocalDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateLocalDatastoreResponse")
  ManagedObjectReference createLocalDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString2) throws DuplicateNameFaultMsg, FileNotFoundFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateVvolDatastore", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateVvolDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVvolDatastoreRequestType")
  @ResponseWrapper(localName = "CreateVvolDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateVvolDatastoreResponse")
  ManagedObjectReference createVvolDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostDatastoreSystemVvolDatastoreSpec paramHostDatastoreSystemVvolDatastoreSpec) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveDatastore", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveDatastore", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDatastoreRequestType")
  @ResponseWrapper(localName = "RemoveDatastoreResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDatastoreResponse")
  void removeDatastore(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveDatastoreEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveDatastoreEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDatastoreExRequestType")
  @ResponseWrapper(localName = "RemoveDatastoreEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDatastoreExTaskResponse")
  ManagedObjectReference removeDatastoreExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "datastore", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureDatastorePrincipal", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ConfigureDatastorePrincipal", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureDatastorePrincipalRequestType")
  @ResponseWrapper(localName = "ConfigureDatastorePrincipalResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureDatastorePrincipalResponse")
  void configureDatastorePrincipal(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryUnresolvedVmfsVolumes", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryUnresolvedVmfsVolumes", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnresolvedVmfsVolumesRequestType")
  @ResponseWrapper(localName = "QueryUnresolvedVmfsVolumesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnresolvedVmfsVolumesResponse")
  List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolumes(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResignatureUnresolvedVmfsVolume_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResignatureUnresolvedVmfsVolume_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResignatureUnresolvedVmfsVolumeRequestType")
  @ResponseWrapper(localName = "ResignatureUnresolvedVmfsVolume_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResignatureUnresolvedVmfsVolumeTaskResponse")
  ManagedObjectReference resignatureUnresolvedVmfsVolumeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "resolutionSpec", targetNamespace = "urn:vim25") HostUnresolvedVmfsResignatureSpec paramHostUnresolvedVmfsResignatureSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg, VmfsAmbiguousMountFaultMsg;
  
  @WebMethod(operationName = "UpdateDateTimeConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDateTimeConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDateTimeConfigRequestType")
  @ResponseWrapper(localName = "UpdateDateTimeConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDateTimeConfigResponse")
  void updateDateTimeConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostDateTimeConfig paramHostDateTimeConfig) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailableTimeZones", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailableTimeZones", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableTimeZonesRequestType")
  @ResponseWrapper(localName = "QueryAvailableTimeZonesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableTimeZonesResponse")
  List<HostDateTimeSystemTimeZone> queryAvailableTimeZones(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDateTime", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDateTime", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDateTimeRequestType")
  @ResponseWrapper(localName = "QueryDateTimeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDateTimeResponse")
  XMLGregorianCalendar queryDateTime(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDateTime", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDateTime", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDateTimeRequestType")
  @ResponseWrapper(localName = "UpdateDateTimeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDateTimeResponse")
  void updateDateTime(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "dateTime", targetNamespace = "urn:vim25") XMLGregorianCalendar paramXMLGregorianCalendar) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshDateTimeSystem", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshDateTimeSystem", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDateTimeSystemRequestType")
  @ResponseWrapper(localName = "RefreshDateTimeSystemResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshDateTimeSystemResponse")
  void refreshDateTimeSystem(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailablePartition", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailablePartition", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailablePartitionRequestType")
  @ResponseWrapper(localName = "QueryAvailablePartitionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailablePartitionResponse")
  List<HostDiagnosticPartition> queryAvailablePartition(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SelectActivePartition", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SelectActivePartition", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectActivePartitionRequestType")
  @ResponseWrapper(localName = "SelectActivePartitionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectActivePartitionResponse")
  void selectActivePartition(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "partition", targetNamespace = "urn:vim25") HostScsiDiskPartition paramHostScsiDiskPartition) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPartitionCreateOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPartitionCreateOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPartitionCreateOptionsRequestType")
  @ResponseWrapper(localName = "QueryPartitionCreateOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPartitionCreateOptionsResponse")
  List<HostDiagnosticPartitionCreateOption> queryPartitionCreateOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "storageType", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "diagnosticType", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPartitionCreateDesc", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPartitionCreateDesc", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPartitionCreateDescRequestType")
  @ResponseWrapper(localName = "QueryPartitionCreateDescResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPartitionCreateDescResponse")
  HostDiagnosticPartitionCreateDescription queryPartitionCreateDesc(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "diskUuid", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "diagnosticType", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDiagnosticPartition", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateDiagnosticPartition", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiagnosticPartitionRequestType")
  @ResponseWrapper(localName = "CreateDiagnosticPartitionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiagnosticPartitionResponse")
  void createDiagnosticPartition(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostDiagnosticPartitionCreateSpec paramHostDiagnosticPartitionCreateSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EsxAgentHostManagerUpdateConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EsxAgentHostManagerUpdateConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EsxAgentHostManagerUpdateConfigRequestType")
  @ResponseWrapper(localName = "EsxAgentHostManagerUpdateConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EsxAgentHostManagerUpdateConfigResponse")
  void esxAgentHostManagerUpdateConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configInfo", targetNamespace = "urn:vim25") HostEsxAgentHostManagerConfigInfo paramHostEsxAgentHostManagerConfigInfo) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDefaultPolicy", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDefaultPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDefaultPolicyRequestType")
  @ResponseWrapper(localName = "UpdateDefaultPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDefaultPolicyResponse")
  void updateDefaultPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "defaultPolicy", targetNamespace = "urn:vim25") HostFirewallDefaultPolicy paramHostFirewallDefaultPolicy) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableRuleset", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableRuleset", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableRulesetRequestType")
  @ResponseWrapper(localName = "EnableRulesetResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableRulesetResponse")
  void enableRuleset(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableRuleset", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableRuleset", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableRulesetRequestType")
  @ResponseWrapper(localName = "DisableRulesetResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableRulesetResponse")
  void disableRuleset(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateRuleset", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateRuleset", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateRulesetRequestType")
  @ResponseWrapper(localName = "UpdateRulesetResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateRulesetResponse")
  void updateRuleset(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostFirewallRulesetRulesetSpec paramHostFirewallRulesetRulesetSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshFirewall", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshFirewall", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshFirewallRequestType")
  @ResponseWrapper(localName = "RefreshFirewallResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshFirewallResponse")
  void refreshFirewall(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetFirmwareToFactoryDefaults", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetFirmwareToFactoryDefaults", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetFirmwareToFactoryDefaultsRequestType")
  @ResponseWrapper(localName = "ResetFirmwareToFactoryDefaultsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetFirmwareToFactoryDefaultsResponse")
  void resetFirmwareToFactoryDefaults(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BackupFirmwareConfiguration", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "BackupFirmwareConfiguration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BackupFirmwareConfigurationRequestType")
  @ResponseWrapper(localName = "BackupFirmwareConfigurationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BackupFirmwareConfigurationResponse")
  String backupFirmwareConfiguration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryFirmwareConfigUploadURL", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryFirmwareConfigUploadURL", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFirmwareConfigUploadURLRequestType")
  @ResponseWrapper(localName = "QueryFirmwareConfigUploadURLResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryFirmwareConfigUploadURLResponse")
  String queryFirmwareConfigUploadURL(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RestoreFirmwareConfiguration", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RestoreFirmwareConfiguration", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestoreFirmwareConfigurationRequestType")
  @ResponseWrapper(localName = "RestoreFirmwareConfigurationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestoreFirmwareConfigurationResponse")
  void restoreFirmwareConfiguration(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws FileFaultFaultMsg, InvalidBundleFaultMsg, InvalidStateFaultMsg, MismatchedBundleFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshGraphicsManager", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshGraphicsManager", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshGraphicsManagerRequestType")
  @ResponseWrapper(localName = "RefreshGraphicsManagerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshGraphicsManagerResponse")
  void refreshGraphicsManager(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "IsSharedGraphicsActive", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "IsSharedGraphicsActive", targetNamespace = "urn:vim25", className = "com.vmware.vim25.IsSharedGraphicsActiveRequestType")
  @ResponseWrapper(localName = "IsSharedGraphicsActiveResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.IsSharedGraphicsActiveResponse")
  boolean isSharedGraphicsActive(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateGraphicsConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateGraphicsConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateGraphicsConfigRequestType")
  @ResponseWrapper(localName = "UpdateGraphicsConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateGraphicsConfigResponse")
  void updateGraphicsConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostGraphicsConfig paramHostGraphicsConfig) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshHealthStatusSystem", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshHealthStatusSystem", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshHealthStatusSystemRequestType")
  @ResponseWrapper(localName = "RefreshHealthStatusSystemResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshHealthStatusSystemResponse")
  void refreshHealthStatusSystem(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetSystemHealthInfo", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetSystemHealthInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetSystemHealthInfoRequestType")
  @ResponseWrapper(localName = "ResetSystemHealthInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetSystemHealthInfoResponse")
  void resetSystemHealthInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClearSystemEventLog", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ClearSystemEventLog", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearSystemEventLogRequestType")
  @ResponseWrapper(localName = "ClearSystemEventLogResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearSystemEventLogResponse")
  void clearSystemEventLog(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FetchSystemEventLog", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FetchSystemEventLog", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchSystemEventLogRequestType")
  @ResponseWrapper(localName = "FetchSystemEventLogResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchSystemEventLogResponse")
  List<SystemEventInfo> fetchSystemEventLog(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveHostAccessControlEntries", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveHostAccessControlEntries", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostAccessControlEntriesRequestType")
  @ResponseWrapper(localName = "RetrieveHostAccessControlEntriesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostAccessControlEntriesResponse")
  List<HostAccessControlEntry> retrieveHostAccessControlEntries(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ChangeAccessMode", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangeAccessMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeAccessModeRequestType")
  @ResponseWrapper(localName = "ChangeAccessModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeAccessModeResponse")
  void changeAccessMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "principal", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "isGroup", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "accessMode", targetNamespace = "urn:vim25") HostAccessMode paramHostAccessMode) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "QuerySystemUsers", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QuerySystemUsers", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySystemUsersRequestType")
  @ResponseWrapper(localName = "QuerySystemUsersResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySystemUsersResponse")
  List<String> querySystemUsers(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateSystemUsers", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateSystemUsers", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemUsersRequestType")
  @ResponseWrapper(localName = "UpdateSystemUsersResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSystemUsersResponse")
  void updateSystemUsers(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "users", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "QueryLockdownExceptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryLockdownExceptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLockdownExceptionsRequestType")
  @ResponseWrapper(localName = "QueryLockdownExceptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryLockdownExceptionsResponse")
  List<String> queryLockdownExceptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateLockdownExceptions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateLockdownExceptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLockdownExceptionsRequestType")
  @ResponseWrapper(localName = "UpdateLockdownExceptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateLockdownExceptionsResponse")
  void updateLockdownExceptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "users", targetNamespace = "urn:vim25") List<String> paramList) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "ChangeLockdownMode", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangeLockdownMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeLockdownModeRequestType")
  @ResponseWrapper(localName = "ChangeLockdownModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeLockdownModeResponse")
  void changeLockdownMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mode", targetNamespace = "urn:vim25") HostLockdownMode paramHostLockdownMode) throws AuthMinimumAdminPermissionFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostImageConfigGetAcceptance", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostImageConfigGetAcceptance", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostImageConfigGetAcceptanceRequestType")
  @ResponseWrapper(localName = "HostImageConfigGetAcceptanceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostImageConfigGetAcceptanceResponse")
  String hostImageConfigGetAcceptance(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostImageConfigGetProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostImageConfigGetProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostImageConfigGetProfileRequestType")
  @ResponseWrapper(localName = "HostImageConfigGetProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostImageConfigGetProfileResponse")
  HostImageProfileSummary hostImageConfigGetProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHostImageAcceptanceLevel", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateHostImageAcceptanceLevel", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostImageAcceptanceLevelRequestType")
  @ResponseWrapper(localName = "UpdateHostImageAcceptanceLevelResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostImageAcceptanceLevelResponse")
  void updateHostImageAcceptanceLevel(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "newAcceptanceLevel", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "fetchSoftwarePackages", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchSoftwarePackagesRequestType")
  @ResponseWrapper(localName = "fetchSoftwarePackagesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FetchSoftwarePackagesResponse")
  List<SoftwarePackage> fetchSoftwarePackages(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "installDate", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallDateRequestType")
  @ResponseWrapper(localName = "installDateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallDateResponse")
  XMLGregorianCalendar installDate(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVnicStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVnicStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVnicStatusRequestType")
  @ResponseWrapper(localName = "QueryVnicStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVnicStatusResponse")
  IscsiStatus queryVnicStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vnicDevice", targetNamespace = "urn:vim25") String paramString) throws IscsiFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPnicStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPnicStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPnicStatusRequestType")
  @ResponseWrapper(localName = "QueryPnicStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPnicStatusResponse")
  IscsiStatus queryPnicStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pnicDevice", targetNamespace = "urn:vim25") String paramString) throws IscsiFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryBoundVnics", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryBoundVnics", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryBoundVnicsRequestType")
  @ResponseWrapper(localName = "QueryBoundVnicsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryBoundVnicsResponse")
  List<IscsiPortInfo> queryBoundVnics(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaName", targetNamespace = "urn:vim25") String paramString) throws IscsiFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryCandidateNics", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryCandidateNics", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCandidateNicsRequestType")
  @ResponseWrapper(localName = "QueryCandidateNicsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCandidateNicsResponse")
  List<IscsiPortInfo> queryCandidateNics(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaName", targetNamespace = "urn:vim25") String paramString) throws IscsiFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "BindVnic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "BindVnic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BindVnicRequestType")
  @ResponseWrapper(localName = "BindVnicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.BindVnicResponse")
  void bindVnic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "vnicDevice", targetNamespace = "urn:vim25") String paramString2) throws IscsiFaultFaultMsg, IscsiFaultInvalidVnicFaultMsg, IscsiFaultVnicAlreadyBoundFaultMsg, IscsiFaultVnicHasMultipleUplinksFaultMsg, IscsiFaultVnicHasNoUplinksFaultMsg, IscsiFaultVnicHasWrongUplinkFaultMsg, IscsiFaultVnicNotFoundFaultMsg, NotFoundFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnbindVnic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnbindVnic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnbindVnicRequestType")
  @ResponseWrapper(localName = "UnbindVnicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnbindVnicResponse")
  void unbindVnic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaName", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "vnicDevice", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "force", targetNamespace = "urn:vim25") boolean paramBoolean) throws IscsiFaultFaultMsg, IscsiFaultVnicHasActivePathsFaultMsg, IscsiFaultVnicIsLastPathFaultMsg, IscsiFaultVnicNotBoundFaultMsg, NotFoundFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryMigrationDependencies", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryMigrationDependencies", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMigrationDependenciesRequestType")
  @ResponseWrapper(localName = "QueryMigrationDependenciesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryMigrationDependenciesResponse")
  IscsiMigrationDependency queryMigrationDependencies(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pnicDevice", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryModules", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryModules", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryModulesRequestType")
  @ResponseWrapper(localName = "QueryModulesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryModulesResponse")
  List<KernelModuleInfo> queryModules(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateModuleOptionString", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateModuleOptionString", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateModuleOptionStringRequestType")
  @ResponseWrapper(localName = "UpdateModuleOptionStringResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateModuleOptionStringResponse")
  void updateModuleOptionString(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "options", targetNamespace = "urn:vim25") String paramString2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryConfiguredModuleOptionString", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryConfiguredModuleOptionString", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfiguredModuleOptionStringRequestType")
  @ResponseWrapper(localName = "QueryConfiguredModuleOptionStringResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryConfiguredModuleOptionStringResponse")
  String queryConfiguredModuleOptionString(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateUser", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateUserRequestType")
  @ResponseWrapper(localName = "CreateUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateUserResponse")
  void createUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") HostAccountSpec paramHostAccountSpec) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateUser", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateUserRequestType")
  @ResponseWrapper(localName = "UpdateUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateUserResponse")
  void updateUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") HostAccountSpec paramHostAccountSpec) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "CreateGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateGroupRequestType")
  @ResponseWrapper(localName = "CreateGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateGroupResponse")
  void createGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "group", targetNamespace = "urn:vim25") HostAccountSpec paramHostAccountSpec) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveUser", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveUserRequestType")
  @ResponseWrapper(localName = "RemoveUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveUserResponse")
  void removeUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "userName", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "RemoveGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGroupRequestType")
  @ResponseWrapper(localName = "RemoveGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGroupResponse")
  void removeGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "groupName", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "AssignUserToGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AssignUserToGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AssignUserToGroupRequestType")
  @ResponseWrapper(localName = "AssignUserToGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AssignUserToGroupResponse")
  void assignUserToGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "group", targetNamespace = "urn:vim25") String paramString2) throws AlreadyExistsFaultMsg, RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "UnassignUserFromGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnassignUserFromGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnassignUserFromGroupRequestType")
  @ResponseWrapper(localName = "UnassignUserFromGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnassignUserFromGroupResponse")
  void unassignUserFromGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "group", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg, UserNotFoundFaultMsg;
  
  @WebMethod(operationName = "ChangePassword", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangePassword", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangePasswordRequestType")
  @ResponseWrapper(localName = "ChangePasswordResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangePasswordResponse")
  void changePassword(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "oldPassword", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "newPassword", targetNamespace = "urn:vim25") String paramString3) throws InvalidLoginFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureServiceConsoleReservation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureServiceConsoleReservation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureServiceConsoleReservationRequestType")
  @ResponseWrapper(localName = "ReconfigureServiceConsoleReservationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureServiceConsoleReservationResponse")
  void reconfigureServiceConsoleReservation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "cfgBytes", targetNamespace = "urn:vim25") long paramLong) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureVirtualMachineReservation", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureVirtualMachineReservation", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureVirtualMachineReservationRequestType")
  @ResponseWrapper(localName = "ReconfigureVirtualMachineReservationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureVirtualMachineReservationResponse")
  void reconfigureVirtualMachineReservation(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineMemoryReservationSpec paramVirtualMachineMemoryReservationSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateNetworkConfig", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateNetworkConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateNetworkConfigRequestType")
  @ResponseWrapper(localName = "UpdateNetworkConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateNetworkConfigResponse")
  HostNetworkConfigResult updateNetworkConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostNetworkConfig paramHostNetworkConfig, @WebParam(name = "changeMode", targetNamespace = "urn:vim25") String paramString) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDnsConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDnsConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDnsConfigRequestType")
  @ResponseWrapper(localName = "UpdateDnsConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDnsConfigResponse")
  void updateDnsConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostDnsConfig paramHostDnsConfig) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateIpRouteConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateIpRouteConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpRouteConfigRequestType")
  @ResponseWrapper(localName = "UpdateIpRouteConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpRouteConfigResponse")
  void updateIpRouteConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostIpRouteConfig paramHostIpRouteConfig) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateConsoleIpRouteConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateConsoleIpRouteConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateConsoleIpRouteConfigRequestType")
  @ResponseWrapper(localName = "UpdateConsoleIpRouteConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateConsoleIpRouteConfigResponse")
  void updateConsoleIpRouteConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostIpRouteConfig paramHostIpRouteConfig) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateIpRouteTableConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateIpRouteTableConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpRouteTableConfigRequestType")
  @ResponseWrapper(localName = "UpdateIpRouteTableConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpRouteTableConfigResponse")
  void updateIpRouteTableConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostIpRouteTableConfig paramHostIpRouteTableConfig) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddVirtualSwitch", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddVirtualSwitch", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddVirtualSwitchRequestType")
  @ResponseWrapper(localName = "AddVirtualSwitchResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddVirtualSwitchResponse")
  void addVirtualSwitch(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vswitchName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostVirtualSwitchSpec paramHostVirtualSwitchSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveVirtualSwitch", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveVirtualSwitch", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveVirtualSwitchRequestType")
  @ResponseWrapper(localName = "RemoveVirtualSwitchResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveVirtualSwitchResponse")
  void removeVirtualSwitch(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vswitchName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVirtualSwitch", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateVirtualSwitch", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualSwitchRequestType")
  @ResponseWrapper(localName = "UpdateVirtualSwitchResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualSwitchResponse")
  void updateVirtualSwitch(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vswitchName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostVirtualSwitchSpec paramHostVirtualSwitchSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddPortGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddPortGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddPortGroupRequestType")
  @ResponseWrapper(localName = "AddPortGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddPortGroupResponse")
  void addPortGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portgrp", targetNamespace = "urn:vim25") HostPortGroupSpec paramHostPortGroupSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemovePortGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemovePortGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemovePortGroupRequestType")
  @ResponseWrapper(localName = "RemovePortGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemovePortGroupResponse")
  void removePortGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pgName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdatePortGroup", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdatePortGroup", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePortGroupRequestType")
  @ResponseWrapper(localName = "UpdatePortGroupResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePortGroupResponse")
  void updatePortGroup(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pgName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "portgrp", targetNamespace = "urn:vim25") HostPortGroupSpec paramHostPortGroupSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdatePhysicalNicLinkSpeed", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdatePhysicalNicLinkSpeed", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePhysicalNicLinkSpeedRequestType")
  @ResponseWrapper(localName = "UpdatePhysicalNicLinkSpeedResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePhysicalNicLinkSpeedResponse")
  void updatePhysicalNicLinkSpeed(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "linkSpeed", targetNamespace = "urn:vim25") PhysicalNicLinkInfo paramPhysicalNicLinkInfo) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryNetworkHint", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryNetworkHint", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNetworkHintRequestType")
  @ResponseWrapper(localName = "QueryNetworkHintResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNetworkHintResponse")
  List<PhysicalNicHintInfo> queryNetworkHint(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddVirtualNic", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddVirtualNicRequestType")
  @ResponseWrapper(localName = "AddVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddVirtualNicResponse")
  String addVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portgroup", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "nic", targetNamespace = "urn:vim25") HostVirtualNicSpec paramHostVirtualNicSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveVirtualNic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveVirtualNicRequestType")
  @ResponseWrapper(localName = "RemoveVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveVirtualNicResponse")
  void removeVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVirtualNic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualNicRequestType")
  @ResponseWrapper(localName = "UpdateVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVirtualNicResponse")
  void updateVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "nic", targetNamespace = "urn:vim25") HostVirtualNicSpec paramHostVirtualNicSpec) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddServiceConsoleVirtualNic", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddServiceConsoleVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddServiceConsoleVirtualNicRequestType")
  @ResponseWrapper(localName = "AddServiceConsoleVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddServiceConsoleVirtualNicResponse")
  String addServiceConsoleVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "portgroup", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "nic", targetNamespace = "urn:vim25") HostVirtualNicSpec paramHostVirtualNicSpec) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveServiceConsoleVirtualNic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveServiceConsoleVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveServiceConsoleVirtualNicRequestType")
  @ResponseWrapper(localName = "RemoveServiceConsoleVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveServiceConsoleVirtualNicResponse")
  void removeServiceConsoleVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateServiceConsoleVirtualNic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateServiceConsoleVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServiceConsoleVirtualNicRequestType")
  @ResponseWrapper(localName = "UpdateServiceConsoleVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServiceConsoleVirtualNicResponse")
  void updateServiceConsoleVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "nic", targetNamespace = "urn:vim25") HostVirtualNicSpec paramHostVirtualNicSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RestartServiceConsoleVirtualNic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RestartServiceConsoleVirtualNic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestartServiceConsoleVirtualNicRequestType")
  @ResponseWrapper(localName = "RestartServiceConsoleVirtualNicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestartServiceConsoleVirtualNicResponse")
  void restartServiceConsoleVirtualNic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshNetworkSystem", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshNetworkSystem", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshNetworkSystemRequestType")
  @ResponseWrapper(localName = "RefreshNetworkSystemResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshNetworkSystemResponse")
  void refreshNetworkSystem(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateNvdimmNamespace_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateNvdimmNamespace_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvdimmNamespaceRequestType")
  @ResponseWrapper(localName = "CreateNvdimmNamespace_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvdimmNamespaceTaskResponse")
  ManagedObjectReference createNvdimmNamespaceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "createSpec", targetNamespace = "urn:vim25") NvdimmNamespaceCreateSpec paramNvdimmNamespaceCreateSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateNvdimmPMemNamespace_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateNvdimmPMemNamespace_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvdimmPMemNamespaceRequestType")
  @ResponseWrapper(localName = "CreateNvdimmPMemNamespace_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvdimmPMemNamespaceTaskResponse")
  ManagedObjectReference createNvdimmPMemNamespaceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "createSpec", targetNamespace = "urn:vim25") NvdimmPMemNamespaceCreateSpec paramNvdimmPMemNamespaceCreateSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteNvdimmNamespace_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteNvdimmNamespace_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteNvdimmNamespaceRequestType")
  @ResponseWrapper(localName = "DeleteNvdimmNamespace_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteNvdimmNamespaceTaskResponse")
  ManagedObjectReference deleteNvdimmNamespaceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "deleteSpec", targetNamespace = "urn:vim25") NvdimmNamespaceDeleteSpec paramNvdimmNamespaceDeleteSpec) throws HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteNvdimmBlockNamespaces_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteNvdimmBlockNamespaces_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteNvdimmBlockNamespacesRequestType")
  @ResponseWrapper(localName = "DeleteNvdimmBlockNamespaces_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteNvdimmBlockNamespacesTaskResponse")
  ManagedObjectReference deleteNvdimmBlockNamespacesTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, InvalidHostStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckHostPatchRequestType")
  @ResponseWrapper(localName = "CheckHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckHostPatchTaskResponse")
  ManagedObjectReference checkHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "metaUrls", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "bundleUrls", targetNamespace = "urn:vim25") List<String> paramList2, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ScanHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ScanHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScanHostPatchRequestType")
  @ResponseWrapper(localName = "ScanHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScanHostPatchTaskResponse")
  ManagedObjectReference scanHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "repository", targetNamespace = "urn:vim25") HostPatchManagerLocator paramHostPatchManagerLocator, @WebParam(name = "updateID", targetNamespace = "urn:vim25") List<String> paramList) throws PatchMetadataInvalidFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ScanHostPatchV2_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ScanHostPatchV2_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScanHostPatchV2RequestType")
  @ResponseWrapper(localName = "ScanHostPatchV2_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScanHostPatchV2TaskResponse")
  ManagedObjectReference scanHostPatchV2Task(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "metaUrls", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "bundleUrls", targetNamespace = "urn:vim25") List<String> paramList2, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "StageHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StageHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StageHostPatchRequestType")
  @ResponseWrapper(localName = "StageHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StageHostPatchTaskResponse")
  ManagedObjectReference stageHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "metaUrls", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "bundleUrls", targetNamespace = "urn:vim25") List<String> paramList2, @WebParam(name = "vibUrls", targetNamespace = "urn:vim25") List<String> paramList3, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "InstallHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InstallHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallHostPatchRequestType")
  @ResponseWrapper(localName = "InstallHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallHostPatchTaskResponse")
  ManagedObjectReference installHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "repository", targetNamespace = "urn:vim25") HostPatchManagerLocator paramHostPatchManagerLocator, @WebParam(name = "updateID", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean) throws InvalidStateFaultMsg, NoDiskSpaceFaultMsg, PatchBinariesNotFoundFaultMsg, PatchInstallFailedFaultMsg, PatchMetadataInvalidFaultMsg, PatchNotApplicableFaultMsg, RebootRequiredFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "InstallHostPatchV2_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InstallHostPatchV2_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallHostPatchV2RequestType")
  @ResponseWrapper(localName = "InstallHostPatchV2_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InstallHostPatchV2TaskResponse")
  ManagedObjectReference installHostPatchV2Task(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "metaUrls", targetNamespace = "urn:vim25") List<String> paramList1, @WebParam(name = "bundleUrls", targetNamespace = "urn:vim25") List<String> paramList2, @WebParam(name = "vibUrls", targetNamespace = "urn:vim25") List<String> paramList3, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "UninstallHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UninstallHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallHostPatchRequestType")
  @ResponseWrapper(localName = "UninstallHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallHostPatchTaskResponse")
  ManagedObjectReference uninstallHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "bulletinIds", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "QueryHostPatch_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHostPatch_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostPatchRequestType")
  @ResponseWrapper(localName = "QueryHostPatch_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostPatchTaskResponse")
  ManagedObjectReference queryHostPatchTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) throws InvalidStateFaultMsg, PlatformConfigFaultFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "Refresh", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "Refresh", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshRequestType")
  @ResponseWrapper(localName = "RefreshResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshResponse")
  void refresh(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdatePassthruConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdatePassthruConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePassthruConfigRequestType")
  @ResponseWrapper(localName = "UpdatePassthruConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdatePassthruConfigResponse")
  void updatePassthruConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") List<HostPciPassthruConfig> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigurePowerPolicy", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ConfigurePowerPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigurePowerPolicyRequestType")
  @ResponseWrapper(localName = "ConfigurePowerPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigurePowerPolicyResponse")
  void configurePowerPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "key", targetNamespace = "urn:vim25") int paramInt) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateServicePolicy", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateServicePolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServicePolicyRequestType")
  @ResponseWrapper(localName = "UpdateServicePolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateServicePolicyResponse")
  void updateServicePolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "policy", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "StartService", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "StartService", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartServiceRequestType")
  @ResponseWrapper(localName = "StartServiceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartServiceResponse")
  void startService(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "StopService", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "StopService", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopServiceRequestType")
  @ResponseWrapper(localName = "StopServiceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StopServiceResponse")
  void stopService(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RestartService", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RestartService", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestartServiceRequestType")
  @ResponseWrapper(localName = "RestartServiceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RestartServiceResponse")
  void restartService(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UninstallService", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UninstallService", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallServiceRequestType")
  @ResponseWrapper(localName = "UninstallServiceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UninstallServiceResponse")
  void uninstallService(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshServices", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshServices", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshServicesRequestType")
  @ResponseWrapper(localName = "RefreshServicesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshServicesResponse")
  void refreshServices(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureSnmpAgent", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureSnmpAgent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureSnmpAgentRequestType")
  @ResponseWrapper(localName = "ReconfigureSnmpAgentResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureSnmpAgentResponse")
  void reconfigureSnmpAgent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostSnmpConfigSpec paramHostSnmpConfigSpec) throws InsufficientResourcesFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SendTestNotification", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SendTestNotification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SendTestNotificationRequestType")
  @ResponseWrapper(localName = "SendTestNotificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SendTestNotificationResponse")
  void sendTestNotification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InsufficientResourcesFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveDiskPartitionInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveDiskPartitionInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDiskPartitionInfoRequestType")
  @ResponseWrapper(localName = "RetrieveDiskPartitionInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDiskPartitionInfoResponse")
  List<HostDiskPartitionInfo> retrieveDiskPartitionInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ComputeDiskPartitionInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ComputeDiskPartitionInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ComputeDiskPartitionInfoRequestType")
  @ResponseWrapper(localName = "ComputeDiskPartitionInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ComputeDiskPartitionInfoResponse")
  HostDiskPartitionInfo computeDiskPartitionInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "layout", targetNamespace = "urn:vim25") HostDiskPartitionLayout paramHostDiskPartitionLayout, @WebParam(name = "partitionFormat", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ComputeDiskPartitionInfoForResize", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ComputeDiskPartitionInfoForResize", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ComputeDiskPartitionInfoForResizeRequestType")
  @ResponseWrapper(localName = "ComputeDiskPartitionInfoForResizeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ComputeDiskPartitionInfoForResizeResponse")
  HostDiskPartitionInfo computeDiskPartitionInfoForResize(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "partition", targetNamespace = "urn:vim25") HostScsiDiskPartition paramHostScsiDiskPartition, @WebParam(name = "blockRange", targetNamespace = "urn:vim25") HostDiskPartitionBlockRange paramHostDiskPartitionBlockRange, @WebParam(name = "partitionFormat", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateDiskPartitions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateDiskPartitions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDiskPartitionsRequestType")
  @ResponseWrapper(localName = "UpdateDiskPartitionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateDiskPartitionsResponse")
  void updateDiskPartitions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostDiskPartitionSpec paramHostDiskPartitionSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FormatVmfs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FormatVmfs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FormatVmfsRequestType")
  @ResponseWrapper(localName = "FormatVmfsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FormatVmfsResponse")
  HostVmfsVolume formatVmfs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "createSpec", targetNamespace = "urn:vim25") HostVmfsSpec paramHostVmfsSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MountVmfsVolume", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MountVmfsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVmfsVolumeRequestType")
  @ResponseWrapper(localName = "MountVmfsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVmfsVolumeResponse")
  void mountVmfsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountVmfsVolume", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnmountVmfsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVmfsVolumeRequestType")
  @ResponseWrapper(localName = "UnmountVmfsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVmfsVolumeResponse")
  void unmountVmfsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountVmfsVolumeEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UnmountVmfsVolumeEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVmfsVolumeExRequestType")
  @ResponseWrapper(localName = "UnmountVmfsVolumeEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVmfsVolumeExTaskResponse")
  ManagedObjectReference unmountVmfsVolumeExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MountVmfsVolumeEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MountVmfsVolumeEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVmfsVolumeExRequestType")
  @ResponseWrapper(localName = "MountVmfsVolumeEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVmfsVolumeExTaskResponse")
  ManagedObjectReference mountVmfsVolumeExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmapVmfsVolumeEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UnmapVmfsVolumeEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmapVmfsVolumeExRequestType")
  @ResponseWrapper(localName = "UnmapVmfsVolumeEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmapVmfsVolumeExTaskResponse")
  ManagedObjectReference unmapVmfsVolumeExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteVmfsVolumeState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteVmfsVolumeState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVmfsVolumeStateRequestType")
  @ResponseWrapper(localName = "DeleteVmfsVolumeStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVmfsVolumeStateResponse")
  void deleteVmfsVolumeState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RescanVmfs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RescanVmfs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanVmfsRequestType")
  @ResponseWrapper(localName = "RescanVmfsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanVmfsResponse")
  void rescanVmfs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AttachVmfsExtent", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AttachVmfsExtent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachVmfsExtentRequestType")
  @ResponseWrapper(localName = "AttachVmfsExtentResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachVmfsExtentResponse")
  void attachVmfsExtent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsPath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "extent", targetNamespace = "urn:vim25") HostScsiDiskPartition paramHostScsiDiskPartition) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExpandVmfsExtent", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ExpandVmfsExtent", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExpandVmfsExtentRequestType")
  @ResponseWrapper(localName = "ExpandVmfsExtentResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExpandVmfsExtentResponse")
  void expandVmfsExtent(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsPath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "extent", targetNamespace = "urn:vim25") HostScsiDiskPartition paramHostScsiDiskPartition) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeVmfs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpgradeVmfs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVmfsRequestType")
  @ResponseWrapper(localName = "UpgradeVmfsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVmfsResponse")
  void upgradeVmfs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsPath", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeVmLayout", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpgradeVmLayout", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVmLayoutRequestType")
  @ResponseWrapper(localName = "UpgradeVmLayoutResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVmLayoutResponse")
  void upgradeVmLayout(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryUnresolvedVmfsVolume", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryUnresolvedVmfsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnresolvedVmfsVolumeRequestType")
  @ResponseWrapper(localName = "QueryUnresolvedVmfsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryUnresolvedVmfsVolumeResponse")
  List<HostUnresolvedVmfsVolume> queryUnresolvedVmfsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResolveMultipleUnresolvedVmfsVolumes", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResolveMultipleUnresolvedVmfsVolumes", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesRequestType")
  @ResponseWrapper(localName = "ResolveMultipleUnresolvedVmfsVolumesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesResponse")
  List<HostUnresolvedVmfsResolutionResult> resolveMultipleUnresolvedVmfsVolumes(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "resolutionSpec", targetNamespace = "urn:vim25") List<HostUnresolvedVmfsResolutionSpec> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResolveMultipleUnresolvedVmfsVolumesEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResolveMultipleUnresolvedVmfsVolumesEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesExRequestType")
  @ResponseWrapper(localName = "ResolveMultipleUnresolvedVmfsVolumesEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResolveMultipleUnresolvedVmfsVolumesExTaskResponse")
  ManagedObjectReference resolveMultipleUnresolvedVmfsVolumesExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "resolutionSpec", targetNamespace = "urn:vim25") List<HostUnresolvedVmfsResolutionSpec> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountForceMountedVmfsVolume", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnmountForceMountedVmfsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountForceMountedVmfsVolumeRequestType")
  @ResponseWrapper(localName = "UnmountForceMountedVmfsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountForceMountedVmfsVolumeResponse")
  void unmountForceMountedVmfsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RescanHba", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RescanHba", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanHbaRequestType")
  @ResponseWrapper(localName = "RescanHbaResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanHbaResponse")
  void rescanHba(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hbaDevice", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RescanAllHba", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RescanAllHba", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanAllHbaRequestType")
  @ResponseWrapper(localName = "RescanAllHbaResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanAllHbaResponse")
  void rescanAllHba(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateSoftwareInternetScsiEnabled", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateSoftwareInternetScsiEnabled", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSoftwareInternetScsiEnabledRequestType")
  @ResponseWrapper(localName = "UpdateSoftwareInternetScsiEnabledResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateSoftwareInternetScsiEnabledResponse")
  void updateSoftwareInternetScsiEnabled(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "enabled", targetNamespace = "urn:vim25") boolean paramBoolean) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiDiscoveryProperties", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiDiscoveryProperties", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiDiscoveryPropertiesRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiDiscoveryPropertiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiDiscoveryPropertiesResponse")
  void updateInternetScsiDiscoveryProperties(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "discoveryProperties", targetNamespace = "urn:vim25") HostInternetScsiHbaDiscoveryProperties paramHostInternetScsiHbaDiscoveryProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiAuthenticationProperties", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiAuthenticationProperties", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAuthenticationPropertiesRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiAuthenticationPropertiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAuthenticationPropertiesResponse")
  void updateInternetScsiAuthenticationProperties(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "authenticationProperties", targetNamespace = "urn:vim25") HostInternetScsiHbaAuthenticationProperties paramHostInternetScsiHbaAuthenticationProperties, @WebParam(name = "targetSet", targetNamespace = "urn:vim25") HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiDigestProperties", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiDigestProperties", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiDigestPropertiesRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiDigestPropertiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiDigestPropertiesResponse")
  void updateInternetScsiDigestProperties(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targetSet", targetNamespace = "urn:vim25") HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet, @WebParam(name = "digestProperties", targetNamespace = "urn:vim25") HostInternetScsiHbaDigestProperties paramHostInternetScsiHbaDigestProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiAdvancedOptions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiAdvancedOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAdvancedOptionsRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiAdvancedOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAdvancedOptionsResponse")
  void updateInternetScsiAdvancedOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targetSet", targetNamespace = "urn:vim25") HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet, @WebParam(name = "options", targetNamespace = "urn:vim25") List<HostInternetScsiHbaParamValue> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiIPProperties", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiIPProperties", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiIPPropertiesRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiIPPropertiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiIPPropertiesResponse")
  void updateInternetScsiIPProperties(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "ipProperties", targetNamespace = "urn:vim25") HostInternetScsiHbaIPProperties paramHostInternetScsiHbaIPProperties) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiName", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiNameRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiNameResponse")
  void updateInternetScsiName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "iScsiName", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateInternetScsiAlias", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateInternetScsiAlias", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAliasRequestType")
  @ResponseWrapper(localName = "UpdateInternetScsiAliasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateInternetScsiAliasResponse")
  void updateInternetScsiAlias(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "iScsiAlias", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddInternetScsiSendTargets", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddInternetScsiSendTargets", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddInternetScsiSendTargetsRequestType")
  @ResponseWrapper(localName = "AddInternetScsiSendTargetsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddInternetScsiSendTargetsResponse")
  void addInternetScsiSendTargets(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<HostInternetScsiHbaSendTarget> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveInternetScsiSendTargets", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveInternetScsiSendTargets", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveInternetScsiSendTargetsRequestType")
  @ResponseWrapper(localName = "RemoveInternetScsiSendTargetsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveInternetScsiSendTargetsResponse")
  void removeInternetScsiSendTargets(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<HostInternetScsiHbaSendTarget> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddInternetScsiStaticTargets", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddInternetScsiStaticTargets", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddInternetScsiStaticTargetsRequestType")
  @ResponseWrapper(localName = "AddInternetScsiStaticTargetsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddInternetScsiStaticTargetsResponse")
  void addInternetScsiStaticTargets(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<HostInternetScsiHbaStaticTarget> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveInternetScsiStaticTargets", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveInternetScsiStaticTargets", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveInternetScsiStaticTargetsRequestType")
  @ResponseWrapper(localName = "RemoveInternetScsiStaticTargetsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveInternetScsiStaticTargetsResponse")
  void removeInternetScsiStaticTargets(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "iScsiHbaDevice", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<HostInternetScsiHbaStaticTarget> paramList) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EnableMultipathPath", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "EnableMultipathPath", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableMultipathPathRequestType")
  @ResponseWrapper(localName = "EnableMultipathPathResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EnableMultipathPathResponse")
  void enableMultipathPath(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pathName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisableMultipathPath", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisableMultipathPath", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableMultipathPathRequestType")
  @ResponseWrapper(localName = "DisableMultipathPathResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisableMultipathPathResponse")
  void disableMultipathPath(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pathName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetMultipathLunPolicy", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetMultipathLunPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetMultipathLunPolicyRequestType")
  @ResponseWrapper(localName = "SetMultipathLunPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetMultipathLunPolicyResponse")
  void setMultipathLunPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "policy", targetNamespace = "urn:vim25") HostMultipathInfoLogicalUnitPolicy paramHostMultipathInfoLogicalUnitPolicy) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHppMultipathLunPolicy", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateHppMultipathLunPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHppMultipathLunPolicyRequestType")
  @ResponseWrapper(localName = "UpdateHppMultipathLunPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHppMultipathLunPolicyResponse")
  void updateHppMultipathLunPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunId", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "policy", targetNamespace = "urn:vim25") HostMultipathInfoHppLogicalUnitPolicy paramHostMultipathInfoHppLogicalUnitPolicy) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPathSelectionPolicyOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPathSelectionPolicyOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPathSelectionPolicyOptionsRequestType")
  @ResponseWrapper(localName = "QueryPathSelectionPolicyOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPathSelectionPolicyOptionsResponse")
  List<HostPathSelectionPolicyOption> queryPathSelectionPolicyOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryStorageArrayTypePolicyOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryStorageArrayTypePolicyOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryStorageArrayTypePolicyOptionsRequestType")
  @ResponseWrapper(localName = "QueryStorageArrayTypePolicyOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryStorageArrayTypePolicyOptionsResponse")
  List<HostStorageArrayTypePolicyOption> queryStorageArrayTypePolicyOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateScsiLunDisplayName", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateScsiLunDisplayName", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateScsiLunDisplayNameRequestType")
  @ResponseWrapper(localName = "UpdateScsiLunDisplayNameResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateScsiLunDisplayNameResponse")
  void updateScsiLunDisplayName(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "displayName", targetNamespace = "urn:vim25") String paramString2) throws DuplicateNameFaultMsg, HostConfigFaultFaultMsg, InvalidNameFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DetachScsiLun", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DetachScsiLun", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachScsiLunRequestType")
  @ResponseWrapper(localName = "DetachScsiLunResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachScsiLunResponse")
  void detachScsiLun(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DetachScsiLunEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DetachScsiLunEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachScsiLunExRequestType")
  @ResponseWrapper(localName = "DetachScsiLunEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachScsiLunExTaskResponse")
  ManagedObjectReference detachScsiLunExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteScsiLunState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteScsiLunState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteScsiLunStateRequestType")
  @ResponseWrapper(localName = "DeleteScsiLunStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteScsiLunStateResponse")
  void deleteScsiLunState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunCanonicalName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AttachScsiLun", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AttachScsiLun", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachScsiLunRequestType")
  @ResponseWrapper(localName = "AttachScsiLunResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachScsiLunResponse")
  void attachScsiLun(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AttachScsiLunEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AttachScsiLunEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachScsiLunExRequestType")
  @ResponseWrapper(localName = "AttachScsiLunEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachScsiLunExTaskResponse")
  ManagedObjectReference attachScsiLunExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RefreshStorageSystem", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RefreshStorageSystem", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageSystemRequestType")
  @ResponseWrapper(localName = "RefreshStorageSystemResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RefreshStorageSystemResponse")
  void refreshStorageSystem(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DiscoverFcoeHbas", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DiscoverFcoeHbas", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DiscoverFcoeHbasRequestType")
  @ResponseWrapper(localName = "DiscoverFcoeHbasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DiscoverFcoeHbasResponse")
  void discoverFcoeHbas(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "fcoeSpec", targetNamespace = "urn:vim25") FcoeConfigFcoeSpecification paramFcoeConfigFcoeSpecification) throws FcoeFaultPnicHasNoPortSetFaultMsg, HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkForRemoval", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkForRemoval", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkForRemovalRequestType")
  @ResponseWrapper(localName = "MarkForRemovalResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkForRemovalResponse")
  void markForRemoval(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hbaName", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "remove", targetNamespace = "urn:vim25") boolean paramBoolean) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FormatVffs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FormatVffs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FormatVffsRequestType")
  @ResponseWrapper(localName = "FormatVffsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FormatVffsResponse")
  HostVffsVolume formatVffs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "createSpec", targetNamespace = "urn:vim25") HostVffsSpec paramHostVffsSpec) throws AlreadyExistsFaultMsg, HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExtendVffs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ExtendVffs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVffsRequestType")
  @ResponseWrapper(localName = "ExtendVffsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendVffsResponse")
  void extendVffs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsPath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostDiskPartitionSpec paramHostDiskPartitionSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyVffs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyVffs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyVffsRequestType")
  @ResponseWrapper(localName = "DestroyVffsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyVffsResponse")
  void destroyVffs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsPath", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MountVffsVolume", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MountVffsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVffsVolumeRequestType")
  @ResponseWrapper(localName = "MountVffsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MountVffsVolumeResponse")
  void mountVffsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountVffsVolume", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnmountVffsVolume", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVffsVolumeRequestType")
  @ResponseWrapper(localName = "UnmountVffsVolumeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountVffsVolumeResponse")
  void unmountVffsVolume(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteVffsVolumeState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteVffsVolumeState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVffsVolumeStateRequestType")
  @ResponseWrapper(localName = "DeleteVffsVolumeStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVffsVolumeStateResponse")
  void deleteVffsVolumeState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RescanVffs", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RescanVffs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanVffsRequestType")
  @ResponseWrapper(localName = "RescanVffsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RescanVffsResponse")
  void rescanVffs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAvailableSsds", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAvailableSsds", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableSsdsRequestType")
  @ResponseWrapper(localName = "QueryAvailableSsdsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAvailableSsdsResponse")
  List<HostScsiDisk> queryAvailableSsds(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vffsPath", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetNFSUser", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetNFSUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetNFSUserRequestType")
  @ResponseWrapper(localName = "SetNFSUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetNFSUserResponse")
  void setNFSUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "user", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ChangeNFSUserPassword", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangeNFSUserPassword", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeNFSUserPasswordRequestType")
  @ResponseWrapper(localName = "ChangeNFSUserPasswordResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeNFSUserPasswordResponse")
  void changeNFSUserPassword(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "password", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryNFSUser", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryNFSUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNFSUserRequestType")
  @ResponseWrapper(localName = "QueryNFSUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNFSUserResponse")
  HostNasVolumeUserInfo queryNFSUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClearNFSUser", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ClearNFSUser", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearNFSUserRequestType")
  @ResponseWrapper(localName = "ClearNFSUserResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearNFSUserResponse")
  void clearNFSUser(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "TurnDiskLocatorLedOn_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "TurnDiskLocatorLedOn_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnDiskLocatorLedOnRequestType")
  @ResponseWrapper(localName = "TurnDiskLocatorLedOn_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnDiskLocatorLedOnTaskResponse")
  ManagedObjectReference turnDiskLocatorLedOnTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuids", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "TurnDiskLocatorLedOff_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "TurnDiskLocatorLedOff_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnDiskLocatorLedOffRequestType")
  @ResponseWrapper(localName = "TurnDiskLocatorLedOff_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TurnDiskLocatorLedOffTaskResponse")
  ManagedObjectReference turnDiskLocatorLedOffTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuids", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkAsSsd_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MarkAsSsd_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsSsdRequestType")
  @ResponseWrapper(localName = "MarkAsSsd_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsSsdTaskResponse")
  ManagedObjectReference markAsSsdTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkAsNonSsd_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MarkAsNonSsd_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsNonSsdRequestType")
  @ResponseWrapper(localName = "MarkAsNonSsd_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsNonSsdTaskResponse")
  ManagedObjectReference markAsNonSsdTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkAsLocal_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MarkAsLocal_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsLocalRequestType")
  @ResponseWrapper(localName = "MarkAsLocal_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsLocalTaskResponse")
  ManagedObjectReference markAsLocalTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkAsNonLocal_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MarkAsNonLocal_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsNonLocalRequestType")
  @ResponseWrapper(localName = "MarkAsNonLocal_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkAsNonLocalTaskResponse")
  ManagedObjectReference markAsNonLocalTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "scsiDiskUuid", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVmfsUnmapPriority", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateVmfsUnmapPriority", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVmfsUnmapPriorityRequestType")
  @ResponseWrapper(localName = "UpdateVmfsUnmapPriorityResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVmfsUnmapPriorityResponse")
  void updateVmfsUnmapPriority(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "unmapPriority", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVmfsUnmapBandwidth", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateVmfsUnmapBandwidth", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVmfsUnmapBandwidthRequestType")
  @ResponseWrapper(localName = "UpdateVmfsUnmapBandwidthResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVmfsUnmapBandwidthResponse")
  void updateVmfsUnmapBandwidth(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vmfsUuid", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "unmapBandwidthSpec", targetNamespace = "urn:vim25") VmfsUnmapBandwidthSpec paramVmfsUnmapBandwidthSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVmfsConfigOption", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVmfsConfigOption", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsConfigOptionRequestType")
  @ResponseWrapper(localName = "QueryVmfsConfigOptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVmfsConfigOptionResponse")
  List<VmfsConfigOption> queryVmfsConfigOption(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkPerenniallyReserved", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkPerenniallyReserved", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkPerenniallyReservedRequestType")
  @ResponseWrapper(localName = "MarkPerenniallyReservedResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkPerenniallyReservedResponse")
  void markPerenniallyReserved(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "state", targetNamespace = "urn:vim25") boolean paramBoolean) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkPerenniallyReservedEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "MarkPerenniallyReservedEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkPerenniallyReservedExRequestType")
  @ResponseWrapper(localName = "MarkPerenniallyReservedEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkPerenniallyReservedExTaskResponse")
  ManagedObjectReference markPerenniallyReservedExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "lunUuid", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "state", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateNvmeOverRdmaAdapter", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateNvmeOverRdmaAdapter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvmeOverRdmaAdapterRequestType")
  @ResponseWrapper(localName = "CreateNvmeOverRdmaAdapterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateNvmeOverRdmaAdapterResponse")
  void createNvmeOverRdmaAdapter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "rdmaDeviceName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveNvmeOverRdmaAdapter", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveNvmeOverRdmaAdapter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveNvmeOverRdmaAdapterRequestType")
  @ResponseWrapper(localName = "RemoveNvmeOverRdmaAdapterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveNvmeOverRdmaAdapterResponse")
  void removeNvmeOverRdmaAdapter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hbaDeviceName", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DiscoverNvmeControllers", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DiscoverNvmeControllers", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DiscoverNvmeControllersRequestType")
  @ResponseWrapper(localName = "DiscoverNvmeControllersResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DiscoverNvmeControllersResponse")
  HostNvmeDiscoveryLog discoverNvmeControllers(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "discoverSpec", targetNamespace = "urn:vim25") HostNvmeDiscoverSpec paramHostNvmeDiscoverSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConnectNvmeController", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ConnectNvmeController", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConnectNvmeControllerRequestType")
  @ResponseWrapper(localName = "ConnectNvmeControllerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConnectNvmeControllerResponse")
  void connectNvmeController(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "connectSpec", targetNamespace = "urn:vim25") HostNvmeConnectSpec paramHostNvmeConnectSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DisconnectNvmeController", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DisconnectNvmeController", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisconnectNvmeControllerRequestType")
  @ResponseWrapper(localName = "DisconnectNvmeControllerResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DisconnectNvmeControllerResponse")
  void disconnectNvmeController(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "disconnectSpec", targetNamespace = "urn:vim25") HostNvmeDisconnectSpec paramHostNvmeDisconnectSpec) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ConfigureVFlashResourceEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ConfigureVFlashResourceEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureVFlashResourceExRequestType")
  @ResponseWrapper(localName = "ConfigureVFlashResourceEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureVFlashResourceExTaskResponse")
  ManagedObjectReference configureVFlashResourceExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "devicePath", targetNamespace = "urn:vim25") List<String> paramList) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostConfigureVFlashResource", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostConfigureVFlashResource", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostConfigureVFlashResourceRequestType")
  @ResponseWrapper(localName = "HostConfigureVFlashResourceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostConfigureVFlashResourceResponse")
  void hostConfigureVFlashResource(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostVFlashManagerVFlashResourceConfigSpec paramHostVFlashManagerVFlashResourceConfigSpec) throws HostConfigFaultFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRemoveVFlashResource", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostRemoveVFlashResource", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRemoveVFlashResourceRequestType")
  @ResponseWrapper(localName = "HostRemoveVFlashResourceResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRemoveVFlashResourceResponse")
  void hostRemoveVFlashResource(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostConfigVFlashCache", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostConfigVFlashCache", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostConfigVFlashCacheRequestType")
  @ResponseWrapper(localName = "HostConfigVFlashCacheResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostConfigVFlashCacheResponse")
  void hostConfigVFlashCache(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") HostVFlashManagerVFlashCacheConfigSpec paramHostVFlashManagerVFlashCacheConfigSpec) throws HostConfigFaultFaultMsg, InaccessibleVFlashSourceFaultMsg, ResourceInUseFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostGetVFlashModuleDefaultConfig", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostGetVFlashModuleDefaultConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostGetVFlashModuleDefaultConfigRequestType")
  @ResponseWrapper(localName = "HostGetVFlashModuleDefaultConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostGetVFlashModuleDefaultConfigResponse")
  VirtualDiskVFlashCacheConfigInfo hostGetVFlashModuleDefaultConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vFlashModule", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateIpConfig", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateIpConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpConfigRequestType")
  @ResponseWrapper(localName = "UpdateIpConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateIpConfigResponse")
  void updateIpConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "ipConfig", targetNamespace = "urn:vim25") HostIpConfig paramHostIpConfig) throws HostConfigFaultFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SelectVnic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SelectVnic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectVnicRequestType")
  @ResponseWrapper(localName = "SelectVnicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectVnicResponse")
  void selectVnic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeselectVnic", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeselectVnic", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeselectVnicRequestType")
  @ResponseWrapper(localName = "DeselectVnicResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeselectVnicResponse")
  void deselectVnic(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws HostConfigFaultFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryNetConfig", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryNetConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNetConfigRequestType")
  @ResponseWrapper(localName = "QueryNetConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryNetConfigResponse")
  VirtualNicManagerNetConfig queryNetConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "nicType", targetNamespace = "urn:vim25") String paramString) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SelectVnicForNicType", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SelectVnicForNicType", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectVnicForNicTypeRequestType")
  @ResponseWrapper(localName = "SelectVnicForNicTypeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SelectVnicForNicTypeResponse")
  void selectVnicForNicType(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "nicType", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeselectVnicForNicType", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeselectVnicForNicType", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeselectVnicForNicTypeRequestType")
  @ResponseWrapper(localName = "DeselectVnicForNicTypeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeselectVnicForNicTypeResponse")
  void deselectVnicForNicType(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "nicType", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "device", targetNamespace = "urn:vim25") String paramString2) throws HostConfigFaultFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryCmmds", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryCmmds", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCmmdsRequestType")
  @ResponseWrapper(localName = "QueryCmmdsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryCmmdsResponse")
  String queryCmmds(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "queries", targetNamespace = "urn:vim25") List<HostVsanInternalSystemCmmdsQuery> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPhysicalVsanDisks", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPhysicalVsanDisks", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPhysicalVsanDisksRequestType")
  @ResponseWrapper(localName = "QueryPhysicalVsanDisksResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPhysicalVsanDisksResponse")
  String queryPhysicalVsanDisks(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "props", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVsanObjects", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVsanObjects", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanObjectsRequestType")
  @ResponseWrapper(localName = "QueryVsanObjectsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanObjectsResponse")
  String queryVsanObjects(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryObjectsOnPhysicalVsanDisk", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryObjectsOnPhysicalVsanDisk", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryObjectsOnPhysicalVsanDiskRequestType")
  @ResponseWrapper(localName = "QueryObjectsOnPhysicalVsanDiskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryObjectsOnPhysicalVsanDiskResponse")
  String queryObjectsOnPhysicalVsanDisk(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "disks", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AbdicateDomOwnership", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AbdicateDomOwnership", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbdicateDomOwnershipRequestType")
  @ResponseWrapper(localName = "AbdicateDomOwnershipResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbdicateDomOwnershipResponse")
  List<String> abdicateDomOwnership(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVsanStatistics", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVsanStatistics", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanStatisticsRequestType")
  @ResponseWrapper(localName = "QueryVsanStatisticsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanStatisticsResponse")
  String queryVsanStatistics(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "labels", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureDomObject", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureDomObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDomObjectRequestType")
  @ResponseWrapper(localName = "ReconfigureDomObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureDomObjectResponse")
  void reconfigureDomObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuid", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "policy", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QuerySyncingVsanObjects", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QuerySyncingVsanObjects", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySyncingVsanObjectsRequestType")
  @ResponseWrapper(localName = "QuerySyncingVsanObjectsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QuerySyncingVsanObjectsResponse")
  String querySyncingVsanObjects(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RunVsanPhysicalDiskDiagnostics", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RunVsanPhysicalDiskDiagnostics", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RunVsanPhysicalDiskDiagnosticsRequestType")
  @ResponseWrapper(localName = "RunVsanPhysicalDiskDiagnosticsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RunVsanPhysicalDiskDiagnosticsResponse")
  List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> runVsanPhysicalDiskDiagnostics(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "disks", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetVsanObjExtAttrs", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetVsanObjExtAttrs", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVsanObjExtAttrsRequestType")
  @ResponseWrapper(localName = "GetVsanObjExtAttrsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVsanObjExtAttrsResponse")
  String getVsanObjExtAttrs(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg, VimFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigurationSatisfiable", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconfigurationSatisfiable", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigurationSatisfiableRequestType")
  @ResponseWrapper(localName = "ReconfigurationSatisfiableResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigurationSatisfiableResponse")
  List<VsanPolicySatisfiability> reconfigurationSatisfiable(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "pcbs", targetNamespace = "urn:vim25") List<VsanPolicyChangeBatch> paramList, @WebParam(name = "ignoreSatisfiability", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg, VimFaultFaultMsg;
  
  @WebMethod(operationName = "CanProvisionObjects", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CanProvisionObjects", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CanProvisionObjectsRequestType")
  @ResponseWrapper(localName = "CanProvisionObjectsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CanProvisionObjectsResponse")
  List<VsanPolicySatisfiability> canProvisionObjects(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "npbs", targetNamespace = "urn:vim25") List<VsanNewPolicyBatch> paramList, @WebParam(name = "ignoreSatisfiability", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg, VimFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteVsanObjects", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteVsanObjects", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVsanObjectsRequestType")
  @ResponseWrapper(localName = "DeleteVsanObjectsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVsanObjectsResponse")
  List<HostVsanInternalSystemDeleteVsanObjectsResult> deleteVsanObjects(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "force", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg, VimFaultFaultMsg;
  
  @WebMethod(operationName = "UpgradeVsanObjects", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpgradeVsanObjects", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVsanObjectsRequestType")
  @ResponseWrapper(localName = "UpgradeVsanObjectsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpgradeVsanObjectsResponse")
  List<HostVsanInternalSystemVsanObjectOperationResult> upgradeVsanObjects(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "newVersion", targetNamespace = "urn:vim25") int paramInt) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVsanObjectUuidsByFilter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVsanObjectUuidsByFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanObjectUuidsByFilterRequestType")
  @ResponseWrapper(localName = "QueryVsanObjectUuidsByFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVsanObjectUuidsByFilterResponse")
  List<String> queryVsanObjectUuidsByFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "uuids", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "limit", targetNamespace = "urn:vim25") Integer paramInteger1, @WebParam(name = "version", targetNamespace = "urn:vim25") Integer paramInteger2) throws RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "QueryDisksForVsan", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryDisksForVsan", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDisksForVsanRequestType")
  @ResponseWrapper(localName = "QueryDisksForVsanResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryDisksForVsanResponse")
  List<VsanHostDiskResult> queryDisksForVsan(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "canonicalName", targetNamespace = "urn:vim25") List<String> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddDisks_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AddDisks_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddDisksRequestType")
  @ResponseWrapper(localName = "AddDisks_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddDisksTaskResponse")
  ManagedObjectReference addDisksTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "disk", targetNamespace = "urn:vim25") List<HostScsiDisk> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "InitializeDisks_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InitializeDisks_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitializeDisksRequestType")
  @ResponseWrapper(localName = "InitializeDisks_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitializeDisksTaskResponse")
  ManagedObjectReference initializeDisksTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mapping", targetNamespace = "urn:vim25") List<VsanHostDiskMapping> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDiskRequestType")
  @ResponseWrapper(localName = "RemoveDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDiskTaskResponse")
  ManagedObjectReference removeDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "disk", targetNamespace = "urn:vim25") List<HostScsiDisk> paramList, @WebParam(name = "maintenanceSpec", targetNamespace = "urn:vim25") HostMaintenanceSpec paramHostMaintenanceSpec, @WebParam(name = "timeout", targetNamespace = "urn:vim25") Integer paramInteger) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveDiskMapping_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveDiskMapping_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDiskMappingRequestType")
  @ResponseWrapper(localName = "RemoveDiskMapping_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveDiskMappingTaskResponse")
  ManagedObjectReference removeDiskMappingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mapping", targetNamespace = "urn:vim25") List<VsanHostDiskMapping> paramList, @WebParam(name = "maintenanceSpec", targetNamespace = "urn:vim25") HostMaintenanceSpec paramHostMaintenanceSpec, @WebParam(name = "timeout", targetNamespace = "urn:vim25") Integer paramInteger) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmountDiskMapping_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UnmountDiskMapping_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountDiskMappingRequestType")
  @ResponseWrapper(localName = "UnmountDiskMapping_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmountDiskMappingTaskResponse")
  ManagedObjectReference unmountDiskMappingTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mapping", targetNamespace = "urn:vim25") List<VsanHostDiskMapping> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVsan_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVsan_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVsanRequestType")
  @ResponseWrapper(localName = "UpdateVsan_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVsanTaskResponse")
  ManagedObjectReference updateVsanTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") VsanHostConfigInfo paramVsanHostConfigInfo) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHostStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHostStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostStatusRequestType")
  @ResponseWrapper(localName = "QueryHostStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostStatusResponse")
  VsanHostClusterStatus queryHostStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "EvacuateVsanNode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "EvacuateVsanNode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EvacuateVsanNodeRequestType")
  @ResponseWrapper(localName = "EvacuateVsanNode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.EvacuateVsanNodeTaskResponse")
  ManagedObjectReference evacuateVsanNodeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "maintenanceSpec", targetNamespace = "urn:vim25") HostMaintenanceSpec paramHostMaintenanceSpec, @WebParam(name = "timeout", targetNamespace = "urn:vim25") int paramInt) throws InvalidStateFaultMsg, RequestCanceledFaultMsg, RuntimeFaultFaultMsg, TimedoutFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "RecommissionVsanNode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RecommissionVsanNode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommissionVsanNodeRequestType")
  @ResponseWrapper(localName = "RecommissionVsanNode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RecommissionVsanNodeTaskResponse")
  ManagedObjectReference recommissionVsanNodeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg, VsanFaultFaultMsg;
  
  @WebMethod(operationName = "QueryOptions", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryOptionsRequestType")
  @ResponseWrapper(localName = "QueryOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryOptionsResponse")
  List<OptionValue> queryOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateOptions", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateOptions", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateOptionsRequestType")
  @ResponseWrapper(localName = "UpdateOptionsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateOptionsResponse")
  void updateOptions(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "changedValue", targetNamespace = "urn:vim25") List<OptionValue> paramList) throws InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckCompliance_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckCompliance_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckComplianceRequestType")
  @ResponseWrapper(localName = "CheckCompliance_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckComplianceTaskResponse")
  ManagedObjectReference checkComplianceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryComplianceStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryComplianceStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryComplianceStatusRequestType")
  @ResponseWrapper(localName = "QueryComplianceStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryComplianceStatusResponse")
  List<ComplianceResult> queryComplianceStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClearComplianceStatus", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ClearComplianceStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearComplianceStatusRequestType")
  @ResponseWrapper(localName = "ClearComplianceStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearComplianceStatusResponse")
  void clearComplianceStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryExpressionMetadata", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryExpressionMetadata", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryExpressionMetadataRequestType")
  @ResponseWrapper(localName = "QueryExpressionMetadataResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryExpressionMetadataResponse")
  List<ProfileExpressionMetadata> queryExpressionMetadata(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "expressionName", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "profile", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveDescription", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveDescription", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDescriptionRequestType")
  @ResponseWrapper(localName = "RetrieveDescriptionResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveDescriptionResponse")
  ProfileDescription retrieveDescription(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyProfile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyProfileRequestType")
  @ResponseWrapper(localName = "DestroyProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyProfileResponse")
  void destroyProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AssociateProfile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AssociateProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AssociateProfileRequestType")
  @ResponseWrapper(localName = "AssociateProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AssociateProfileResponse")
  void associateProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DissociateProfile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DissociateProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DissociateProfileRequestType")
  @ResponseWrapper(localName = "DissociateProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DissociateProfileResponse")
  void dissociateProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckProfileCompliance_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckProfileCompliance_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckProfileComplianceRequestType")
  @ResponseWrapper(localName = "CheckProfileCompliance_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckProfileComplianceTaskResponse")
  ManagedObjectReference checkProfileComplianceTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExportProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExportProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportProfileRequestType")
  @ResponseWrapper(localName = "ExportProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportProfileResponse")
  String exportProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateProfileRequestType")
  @ResponseWrapper(localName = "CreateProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateProfileResponse")
  ManagedObjectReference createProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "createSpec", targetNamespace = "urn:vim25") ProfileCreateSpec paramProfileCreateSpec) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryPolicyMetadata", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryPolicyMetadata", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPolicyMetadataRequestType")
  @ResponseWrapper(localName = "QueryPolicyMetadataResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryPolicyMetadataResponse")
  List<ProfilePolicyMetadata> queryPolicyMetadata(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "policyName", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "profile", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "FindAssociatedProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "FindAssociatedProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAssociatedProfileRequestType")
  @ResponseWrapper(localName = "FindAssociatedProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.FindAssociatedProfileResponse")
  List<ManagedObjectReference> findAssociatedProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateClusterProfile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateClusterProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateClusterProfileRequestType")
  @ResponseWrapper(localName = "UpdateClusterProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateClusterProfileResponse")
  void updateClusterProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") ClusterProfileConfigSpec paramClusterProfileConfigSpec) throws DuplicateNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostProfileResetValidationState", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostProfileResetValidationState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostProfileResetValidationStateRequestType")
  @ResponseWrapper(localName = "HostProfileResetValidationStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostProfileResetValidationStateResponse")
  void hostProfileResetValidationState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateReferenceHost", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateReferenceHost", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateReferenceHostRequestType")
  @ResponseWrapper(localName = "UpdateReferenceHostResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateReferenceHostResponse")
  void updateReferenceHost(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHostProfile", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateHostProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostProfileRequestType")
  @ResponseWrapper(localName = "UpdateHostProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostProfileResponse")
  void updateHostProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "config", targetNamespace = "urn:vim25") HostProfileConfigSpec paramHostProfileConfigSpec) throws DuplicateNameFaultMsg, ProfileUpdateFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExecuteHostProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExecuteHostProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExecuteHostProfileRequestType")
  @ResponseWrapper(localName = "ExecuteHostProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExecuteHostProfileResponse")
  ProfileExecuteResult executeHostProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "deferredParam", targetNamespace = "urn:vim25") List<ProfileDeferredPolicyOptionParameter> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHostSpecification", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateHostSpecification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostSpecificationRequestType")
  @ResponseWrapper(localName = "UpdateHostSpecificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostSpecificationResponse")
  void updateHostSpecification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "hostSpec", targetNamespace = "urn:vim25") HostSpecification paramHostSpecification) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHostSubSpecification", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UpdateHostSubSpecification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostSubSpecificationRequestType")
  @ResponseWrapper(localName = "UpdateHostSubSpecificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostSubSpecificationResponse")
  void updateHostSubSpecification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "hostSubSpec", targetNamespace = "urn:vim25") HostSubSpecification paramHostSubSpecification) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveHostSpecification", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveHostSpecification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostSpecificationRequestType")
  @ResponseWrapper(localName = "RetrieveHostSpecificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostSpecificationResponse")
  HostSpecification retrieveHostSpecification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "fromHost", targetNamespace = "urn:vim25") boolean paramBoolean) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteHostSubSpecification", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteHostSubSpecification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteHostSubSpecificationRequestType")
  @ResponseWrapper(localName = "DeleteHostSubSpecificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteHostSubSpecificationResponse")
  void deleteHostSubSpecification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "subSpecName", targetNamespace = "urn:vim25") String paramString) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteHostSpecification", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteHostSpecification", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteHostSpecificationRequestType")
  @ResponseWrapper(localName = "DeleteHostSpecificationResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteHostSpecificationResponse")
  void deleteHostSpecification(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws HostSpecificationOperationFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostSpecGetUpdatedHosts", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostSpecGetUpdatedHosts", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostSpecGetUpdatedHostsRequestType")
  @ResponseWrapper(localName = "HostSpecGetUpdatedHostsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostSpecGetUpdatedHostsResponse")
  List<ManagedObjectReference> hostSpecGetUpdatedHosts(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "startChangeID", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "endChangeID", targetNamespace = "urn:vim25") String paramString2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyHostConfig_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ApplyHostConfig_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyHostConfigRequestType")
  @ResponseWrapper(localName = "ApplyHostConfig_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyHostConfigTaskResponse")
  ManagedObjectReference applyHostConfigTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") HostConfigSpec paramHostConfigSpec, @WebParam(name = "userInput", targetNamespace = "urn:vim25") List<ProfileDeferredPolicyOptionParameter> paramList) throws HostConfigFailedFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateConfigTaskList", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateConfigTaskList", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateConfigTaskListRequestType")
  @ResponseWrapper(localName = "GenerateConfigTaskListResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateConfigTaskListResponse")
  HostProfileManagerConfigTaskList generateConfigTaskList(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") HostConfigSpec paramHostConfigSpec, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateHostProfileTaskList_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateHostProfileTaskList_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateHostProfileTaskListRequestType")
  @ResponseWrapper(localName = "GenerateHostProfileTaskList_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateHostProfileTaskListTaskResponse")
  ManagedObjectReference generateHostProfileTaskListTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") HostConfigSpec paramHostConfigSpec, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryHostProfileMetadata", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryHostProfileMetadata", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostProfileMetadataRequestType")
  @ResponseWrapper(localName = "QueryHostProfileMetadataResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryHostProfileMetadataResponse")
  List<ProfileMetadata> queryHostProfileMetadata(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "profileName", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "profile", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryProfileStructure", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryProfileStructure", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProfileStructureRequestType")
  @ResponseWrapper(localName = "QueryProfileStructureResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryProfileStructureResponse")
  ProfileProfileStructure queryProfileStructure(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "profile", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDefaultProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDefaultProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDefaultProfileRequestType")
  @ResponseWrapper(localName = "CreateDefaultProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDefaultProfileResponse")
  ApplyProfile createDefaultProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "profileType", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "profileTypeName", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "profile", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateAnswerFile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateAnswerFile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAnswerFileRequestType")
  @ResponseWrapper(localName = "UpdateAnswerFile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateAnswerFileTaskResponse")
  ManagedObjectReference updateAnswerFileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") AnswerFileCreateSpec paramAnswerFileCreateSpec) throws AnswerFileUpdateFailedFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveAnswerFile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveAnswerFile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAnswerFileRequestType")
  @ResponseWrapper(localName = "RetrieveAnswerFileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAnswerFileResponse")
  AnswerFile retrieveAnswerFile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveAnswerFileForProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveAnswerFileForProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAnswerFileForProfileRequestType")
  @ResponseWrapper(localName = "RetrieveAnswerFileForProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveAnswerFileForProfileResponse")
  AnswerFile retrieveAnswerFileForProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "applyProfile", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExportAnswerFile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExportAnswerFile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportAnswerFileRequestType")
  @ResponseWrapper(localName = "ExportAnswerFile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportAnswerFileTaskResponse")
  ManagedObjectReference exportAnswerFileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckAnswerFileStatus_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckAnswerFileStatus_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckAnswerFileStatusRequestType")
  @ResponseWrapper(localName = "CheckAnswerFileStatus_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckAnswerFileStatusTaskResponse")
  ManagedObjectReference checkAnswerFileStatusTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryAnswerFileStatus", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryAnswerFileStatus", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAnswerFileStatusRequestType")
  @ResponseWrapper(localName = "QueryAnswerFileStatusResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryAnswerFileStatusResponse")
  List<AnswerFileStatusResult> queryAnswerFileStatus(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateHostCustomizations_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateHostCustomizations_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostCustomizationsRequestType")
  @ResponseWrapper(localName = "UpdateHostCustomizations_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateHostCustomizationsTaskResponse")
  ManagedObjectReference updateHostCustomizationsTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostToConfigSpecMap", targetNamespace = "urn:vim25") List<HostProfileManagerHostToConfigSpecMap> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveHostCustomizations", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveHostCustomizations", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostCustomizationsRequestType")
  @ResponseWrapper(localName = "RetrieveHostCustomizationsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostCustomizationsResponse")
  List<StructuredCustomizations> retrieveHostCustomizations(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveHostCustomizationsForProfile", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveHostCustomizationsForProfile", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostCustomizationsForProfileRequestType")
  @ResponseWrapper(localName = "RetrieveHostCustomizationsForProfileResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveHostCustomizationsForProfileResponse")
  List<StructuredCustomizations> retrieveHostCustomizationsForProfile(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hosts", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "applyProfile", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GenerateHostConfigTaskSpec_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GenerateHostConfigTaskSpec_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateHostConfigTaskSpecRequestType")
  @ResponseWrapper(localName = "GenerateHostConfigTaskSpec_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GenerateHostConfigTaskSpecTaskResponse")
  ManagedObjectReference generateHostConfigTaskSpecTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "hostsInfo", targetNamespace = "urn:vim25") List<StructuredCustomizations> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ApplyEntitiesConfig_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ApplyEntitiesConfig_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyEntitiesConfigRequestType")
  @ResponseWrapper(localName = "ApplyEntitiesConfig_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ApplyEntitiesConfigTaskResponse")
  ManagedObjectReference applyEntitiesConfigTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "applyConfigSpecs", targetNamespace = "urn:vim25") List<ApplyHostProfileConfigurationSpec> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ValidateHostProfileComposition_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ValidateHostProfileComposition_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHostProfileCompositionRequestType")
  @ResponseWrapper(localName = "ValidateHostProfileComposition_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateHostProfileCompositionTaskResponse")
  ManagedObjectReference validateHostProfileCompositionTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "source", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "toBeMerged", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile1, @WebParam(name = "toReplaceWith", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile2, @WebParam(name = "toBeDeleted", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile3, @WebParam(name = "enableStatusToBeCopied", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile4, @WebParam(name = "errorOnly", targetNamespace = "urn:vim25") Boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CompositeHostProfile_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CompositeHostProfile_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CompositeHostProfileRequestType")
  @ResponseWrapper(localName = "CompositeHostProfile_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CompositeHostProfileTaskResponse")
  ManagedObjectReference compositeHostProfileTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "source", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "targets", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList, @WebParam(name = "toBeMerged", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile1, @WebParam(name = "toBeReplacedWith", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile2, @WebParam(name = "toBeDeleted", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile3, @WebParam(name = "enableStatusToBeCopied", targetNamespace = "urn:vim25") HostApplyProfile paramHostApplyProfile4) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveScheduledTask", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveScheduledTaskRequestType")
  @ResponseWrapper(localName = "RemoveScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveScheduledTaskResponse")
  void removeScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconfigureScheduledTask", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReconfigureScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureScheduledTaskRequestType")
  @ResponseWrapper(localName = "ReconfigureScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconfigureScheduledTaskResponse")
  void reconfigureScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") ScheduledTaskSpec paramScheduledTaskSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RunScheduledTask", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RunScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RunScheduledTaskRequestType")
  @ResponseWrapper(localName = "RunScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RunScheduledTaskResponse")
  void runScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateScheduledTask", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateScheduledTaskRequestType")
  @ResponseWrapper(localName = "CreateScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateScheduledTaskResponse")
  ManagedObjectReference createScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") ScheduledTaskSpec paramScheduledTaskSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveEntityScheduledTask", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveEntityScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveEntityScheduledTaskRequestType")
  @ResponseWrapper(localName = "RetrieveEntityScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveEntityScheduledTaskResponse")
  List<ManagedObjectReference> retrieveEntityScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "entity", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateObjectScheduledTask", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateObjectScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateObjectScheduledTaskRequestType")
  @ResponseWrapper(localName = "CreateObjectScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateObjectScheduledTaskResponse")
  ManagedObjectReference createObjectScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "obj", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") ScheduledTaskSpec paramScheduledTaskSpec) throws DuplicateNameFaultMsg, InvalidNameFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveObjectScheduledTask", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveObjectScheduledTask", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveObjectScheduledTaskRequestType")
  @ResponseWrapper(localName = "RetrieveObjectScheduledTaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveObjectScheduledTaskResponse")
  List<ManagedObjectReference> retrieveObjectScheduledTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "obj", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "MarkServiceProviderEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MarkServiceProviderEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkServiceProviderEntitiesRequestType")
  @ResponseWrapper(localName = "MarkServiceProviderEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MarkServiceProviderEntitiesResponse")
  void markServiceProviderEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws AuthMinimumAdminPermissionFaultMsg, ManagedObjectNotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UnmarkServiceProviderEntities", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "UnmarkServiceProviderEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmarkServiceProviderEntitiesRequestType")
  @ResponseWrapper(localName = "UnmarkServiceProviderEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UnmarkServiceProviderEntitiesResponse")
  void unmarkServiceProviderEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws ManagedObjectNotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveServiceProviderEntities", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveServiceProviderEntities", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveServiceProviderEntitiesRequestType")
  @ResponseWrapper(localName = "RetrieveServiceProviderEntitiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveServiceProviderEntitiesResponse")
  List<ManagedObjectReference> retrieveServiceProviderEntities(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "prepareVcha_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "prepareVcha_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PrepareVchaRequestType")
  @ResponseWrapper(localName = "prepareVcha_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.PrepareVchaTaskResponse")
  ManagedObjectReference prepareVchaTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "networkSpec", targetNamespace = "urn:vim25") VchaClusterNetworkSpec paramVchaClusterNetworkSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "deployVcha_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "deployVcha_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeployVchaRequestType")
  @ResponseWrapper(localName = "deployVcha_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeployVchaTaskResponse")
  ManagedObjectReference deployVchaTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "deploymentSpec", targetNamespace = "urn:vim25") VchaClusterDeploymentSpec paramVchaClusterDeploymentSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "configureVcha_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "configureVcha_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureVchaRequestType")
  @ResponseWrapper(localName = "configureVcha_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ConfigureVchaTaskResponse")
  ManagedObjectReference configureVchaTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "configSpec", targetNamespace = "urn:vim25") VchaClusterConfigSpec paramVchaClusterConfigSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "createPassiveNode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "createPassiveNode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePassiveNodeRequestType")
  @ResponseWrapper(localName = "createPassiveNode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePassiveNodeTaskResponse")
  ManagedObjectReference createPassiveNodeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "passiveDeploymentSpec", targetNamespace = "urn:vim25") PassiveNodeDeploymentSpec paramPassiveNodeDeploymentSpec, @WebParam(name = "sourceVcSpec", targetNamespace = "urn:vim25") SourceNodeSpec paramSourceNodeSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "createWitnessNode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "createWitnessNode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateWitnessNodeRequestType")
  @ResponseWrapper(localName = "createWitnessNode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateWitnessNodeTaskResponse")
  ManagedObjectReference createWitnessNodeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "witnessDeploymentSpec", targetNamespace = "urn:vim25") NodeDeploymentSpec paramNodeDeploymentSpec, @WebParam(name = "sourceVcSpec", targetNamespace = "urn:vim25") SourceNodeSpec paramSourceNodeSpec) throws RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "getVchaConfig", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVchaConfigRequestType")
  @ResponseWrapper(localName = "getVchaConfigResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVchaConfigResponse")
  VchaClusterConfigInfo getVchaConfig(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "destroyVcha_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "destroyVcha_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyVchaRequestType")
  @ResponseWrapper(localName = "destroyVcha_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyVchaTaskResponse")
  ManagedObjectReference destroyVchaTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "setClusterMode_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "setClusterMode_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetClusterModeRequestType")
  @ResponseWrapper(localName = "setClusterMode_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetClusterModeTaskResponse")
  ManagedObjectReference setClusterModeTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "mode", targetNamespace = "urn:vim25") String paramString) throws RuntimeFaultFaultMsg;
  
  @WebMethod(action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "getClusterMode", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetClusterModeRequestType")
  @ResponseWrapper(localName = "getClusterModeResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetClusterModeResponse")
  String getClusterMode(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "GetVchaClusterHealth", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "GetVchaClusterHealth", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVchaClusterHealthRequestType")
  @ResponseWrapper(localName = "GetVchaClusterHealthResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.GetVchaClusterHealthResponse")
  VchaClusterHealth getVchaClusterHealth(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "initiateFailover_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "initiateFailover_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFailoverRequestType")
  @ResponseWrapper(localName = "initiateFailover_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFailoverTaskResponse")
  ManagedObjectReference initiateFailoverTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "planned", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "OpenInventoryViewFolder", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "OpenInventoryViewFolder", targetNamespace = "urn:vim25", className = "com.vmware.vim25.OpenInventoryViewFolderRequestType")
  @ResponseWrapper(localName = "OpenInventoryViewFolderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.OpenInventoryViewFolderResponse")
  List<ManagedObjectReference> openInventoryViewFolder(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CloseInventoryViewFolder", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CloseInventoryViewFolder", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloseInventoryViewFolderRequestType")
  @ResponseWrapper(localName = "CloseInventoryViewFolderResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloseInventoryViewFolderResponse")
  List<ManagedObjectReference> closeInventoryViewFolder(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "entity", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ModifyListView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ModifyListView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ModifyListViewRequestType")
  @ResponseWrapper(localName = "ModifyListViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ModifyListViewResponse")
  List<ManagedObjectReference> modifyListView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "add", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "remove", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetListView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ResetListView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetListViewRequestType")
  @ResponseWrapper(localName = "ResetListViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetListViewResponse")
  List<ManagedObjectReference> resetListView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "obj", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ResetListViewFromView", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ResetListViewFromView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetListViewFromViewRequestType")
  @ResponseWrapper(localName = "ResetListViewFromViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ResetListViewFromViewResponse")
  void resetListViewFromView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "view", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyView", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyViewRequestType")
  @ResponseWrapper(localName = "DestroyViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyViewResponse")
  void destroyView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateInventoryView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateInventoryView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateInventoryViewRequestType")
  @ResponseWrapper(localName = "CreateInventoryViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateInventoryViewResponse")
  ManagedObjectReference createInventoryView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateContainerView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateContainerView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateContainerViewRequestType")
  @ResponseWrapper(localName = "CreateContainerViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateContainerViewResponse")
  ManagedObjectReference createContainerView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "container", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "type", targetNamespace = "urn:vim25") List<String> paramList, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateListView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateListView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateListViewRequestType")
  @ResponseWrapper(localName = "CreateListViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateListViewResponse")
  ManagedObjectReference createListView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "obj", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateListViewFromView", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateListViewFromView", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateListViewFromViewRequestType")
  @ResponseWrapper(localName = "CreateListViewFromViewResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateListViewFromViewResponse")
  ManagedObjectReference createListViewFromView(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "view", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CustomizeGuest_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CustomizeGuest_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizeGuestRequestType")
  @ResponseWrapper(localName = "CustomizeGuest_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CustomizeGuestTaskResponse")
  ManagedObjectReference customizeGuestTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "spec", targetNamespace = "urn:vim25") CustomizationSpec paramCustomizationSpec, @WebParam(name = "configParams", targetNamespace = "urn:vim25") List<OptionValue> paramList) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "StartGuestNetwork_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StartGuestNetwork_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartGuestNetworkRequestType")
  @ResponseWrapper(localName = "StartGuestNetwork_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartGuestNetworkTaskResponse")
  ManagedObjectReference startGuestNetworkTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "AbortCustomization_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AbortCustomization_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbortCustomizationRequestType")
  @ResponseWrapper(localName = "AbortCustomization_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AbortCustomizationTaskResponse")
  ManagedObjectReference abortCustomizationTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication) throws CustomizationFaultFaultMsg, GuestPermissionDeniedFaultMsg, InvalidGuestLoginFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RevertToSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RevertToSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertToSnapshotRequestType")
  @ResponseWrapper(localName = "RevertToSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertToSnapshotTaskResponse")
  ManagedObjectReference revertToSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "suppressPowerOn", targetNamespace = "urn:vim25") Boolean paramBoolean) throws FileFaultFaultMsg, InsufficientResourcesFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg, VmConfigFaultFaultMsg;
  
  @WebMethod(operationName = "RemoveSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RemoveSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSnapshotRequestType")
  @ResponseWrapper(localName = "RemoveSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveSnapshotTaskResponse")
  ManagedObjectReference removeSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "removeChildren", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "consolidate", targetNamespace = "urn:vim25") Boolean paramBoolean1) throws RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RenameSnapshot", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RenameSnapshot", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameSnapshotRequestType")
  @ResponseWrapper(localName = "RenameSnapshotResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameSnapshotResponse")
  void renameSnapshot(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString2) throws InvalidNameFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ExportSnapshot", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExportSnapshot", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportSnapshotRequestType")
  @ResponseWrapper(localName = "ExportSnapshotResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExportSnapshotResponse")
  ManagedObjectReference exportSnapshot(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws FileFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CheckCompatibility_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckCompatibility_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCompatibilityRequestType")
  @ResponseWrapper(localName = "CheckCompatibility_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCompatibilityTaskResponse")
  ManagedObjectReference checkCompatibilityTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference4, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckVmConfig_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckVmConfig_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckVmConfigRequestType")
  @ResponseWrapper(localName = "CheckVmConfig_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckVmConfigTaskResponse")
  ManagedObjectReference checkVmConfigTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineConfigSpec paramVirtualMachineConfigSpec, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference4, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckPowerOn_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckPowerOn_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckPowerOnRequestType")
  @ResponseWrapper(localName = "CheckPowerOn_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckPowerOnTaskResponse")
  ManagedObjectReference checkPowerOnTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference4, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws DatacenterMismatchFaultMsg, InvalidArgumentFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "QueryVMotionCompatibilityEx_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "QueryVMotionCompatibilityEx_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVMotionCompatibilityExRequestType")
  @ResponseWrapper(localName = "QueryVMotionCompatibilityEx_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.QueryVMotionCompatibilityExTaskResponse")
  ManagedObjectReference queryVMotionCompatibilityExTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "vm", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList1, @WebParam(name = "host", targetNamespace = "urn:vim25") List<ManagedObjectReference> paramList2) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckMigrate_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckMigrate_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckMigrateRequestType")
  @ResponseWrapper(localName = "CheckMigrate_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckMigrateTaskResponse")
  ManagedObjectReference checkMigrateTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "host", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "pool", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference4, @WebParam(name = "state", targetNamespace = "urn:vim25") VirtualMachinePowerState paramVirtualMachinePowerState, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckRelocate_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckRelocate_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckRelocateRequestType")
  @ResponseWrapper(localName = "CheckRelocate_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckRelocateTaskResponse")
  ManagedObjectReference checkRelocateTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckClone_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckClone_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCloneRequestType")
  @ResponseWrapper(localName = "CheckClone_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckCloneTaskResponse")
  ManagedObjectReference checkCloneTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "folder", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference3, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineCloneSpec paramVirtualMachineCloneSpec, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckInstantClone_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckInstantClone_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckInstantCloneRequestType")
  @ResponseWrapper(localName = "CheckInstantClone_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckInstantCloneTaskResponse")
  ManagedObjectReference checkInstantCloneTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VirtualMachineInstantCloneSpec paramVirtualMachineInstantCloneSpec, @WebParam(name = "testType", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidStateFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AddGuestAlias", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AddGuestAlias", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddGuestAliasRequestType")
  @ResponseWrapper(localName = "AddGuestAliasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AddGuestAliasResponse")
  void addGuestAlias(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "username", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "mapCert", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "base64Cert", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "aliasInfo", targetNamespace = "urn:vim25") GuestAuthAliasInfo paramGuestAuthAliasInfo) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RemoveGuestAlias", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveGuestAlias", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGuestAliasRequestType")
  @ResponseWrapper(localName = "RemoveGuestAliasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGuestAliasResponse")
  void removeGuestAlias(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "username", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "base64Cert", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "subject", targetNamespace = "urn:vim25") GuestAuthSubject paramGuestAuthSubject) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RemoveGuestAliasByCert", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RemoveGuestAliasByCert", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGuestAliasByCertRequestType")
  @ResponseWrapper(localName = "RemoveGuestAliasByCertResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RemoveGuestAliasByCertResponse")
  void removeGuestAliasByCert(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "username", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "base64Cert", targetNamespace = "urn:vim25") String paramString2) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListGuestAliases", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListGuestAliases", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListGuestAliasesRequestType")
  @ResponseWrapper(localName = "ListGuestAliasesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListGuestAliasesResponse")
  List<GuestAliases> listGuestAliases(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "username", targetNamespace = "urn:vim25") String paramString) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListGuestMappedAliases", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListGuestMappedAliases", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListGuestMappedAliasesRequestType")
  @ResponseWrapper(localName = "ListGuestMappedAliasesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListGuestMappedAliasesResponse")
  List<GuestMappedAliases> listGuestMappedAliases(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ValidateCredentialsInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ValidateCredentialsInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateCredentialsInGuestRequestType")
  @ResponseWrapper(localName = "ValidateCredentialsInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ValidateCredentialsInGuestResponse")
  void validateCredentialsInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "AcquireCredentialsInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "AcquireCredentialsInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCredentialsInGuestRequestType")
  @ResponseWrapper(localName = "AcquireCredentialsInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AcquireCredentialsInGuestResponse")
  GuestAuthentication acquireCredentialsInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "requestedAuth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "sessionID", targetNamespace = "urn:vim25") Long paramLong) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ReleaseCredentialsInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ReleaseCredentialsInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseCredentialsInGuestRequestType")
  @ResponseWrapper(localName = "ReleaseCredentialsInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReleaseCredentialsInGuestResponse")
  void releaseCredentialsInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "MakeDirectoryInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MakeDirectoryInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakeDirectoryInGuestRequestType")
  @ResponseWrapper(localName = "MakeDirectoryInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MakeDirectoryInGuestResponse")
  void makeDirectoryInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "directoryPath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "createParentDirectories", targetNamespace = "urn:vim25") boolean paramBoolean) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "DeleteFileInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteFileInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteFileInGuestRequestType")
  @ResponseWrapper(localName = "DeleteFileInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteFileInGuestResponse")
  void deleteFileInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "filePath", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "DeleteDirectoryInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteDirectoryInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDirectoryInGuestRequestType")
  @ResponseWrapper(localName = "DeleteDirectoryInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteDirectoryInGuestResponse")
  void deleteDirectoryInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "directoryPath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "MoveDirectoryInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MoveDirectoryInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDirectoryInGuestRequestType")
  @ResponseWrapper(localName = "MoveDirectoryInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveDirectoryInGuestResponse")
  void moveDirectoryInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "srcDirectoryPath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "dstDirectoryPath", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "MoveFileInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "MoveFileInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveFileInGuestRequestType")
  @ResponseWrapper(localName = "MoveFileInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.MoveFileInGuestResponse")
  void moveFileInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "srcFilePath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "dstFilePath", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "overwrite", targetNamespace = "urn:vim25") boolean paramBoolean) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateTemporaryFileInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateTemporaryFileInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTemporaryFileInGuestRequestType")
  @ResponseWrapper(localName = "CreateTemporaryFileInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTemporaryFileInGuestResponse")
  String createTemporaryFileInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "prefix", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "suffix", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "directoryPath", targetNamespace = "urn:vim25") String paramString3) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateTemporaryDirectoryInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateTemporaryDirectoryInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTemporaryDirectoryInGuestRequestType")
  @ResponseWrapper(localName = "CreateTemporaryDirectoryInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateTemporaryDirectoryInGuestResponse")
  String createTemporaryDirectoryInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "prefix", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "suffix", targetNamespace = "urn:vim25") String paramString2, @WebParam(name = "directoryPath", targetNamespace = "urn:vim25") String paramString3) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListFilesInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListFilesInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListFilesInGuestRequestType")
  @ResponseWrapper(localName = "ListFilesInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListFilesInGuestResponse")
  GuestListFileInfo listFilesInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "filePath", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "index", targetNamespace = "urn:vim25") Integer paramInteger1, @WebParam(name = "maxResults", targetNamespace = "urn:vim25") Integer paramInteger2, @WebParam(name = "matchPattern", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ChangeFileAttributesInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ChangeFileAttributesInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeFileAttributesInGuestRequestType")
  @ResponseWrapper(localName = "ChangeFileAttributesInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ChangeFileAttributesInGuestResponse")
  void changeFileAttributesInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "guestFilePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "fileAttributes", targetNamespace = "urn:vim25") GuestFileAttributes paramGuestFileAttributes) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "InitiateFileTransferFromGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InitiateFileTransferFromGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFileTransferFromGuestRequestType")
  @ResponseWrapper(localName = "InitiateFileTransferFromGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFileTransferFromGuestResponse")
  FileTransferInformation initiateFileTransferFromGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "guestFilePath", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "InitiateFileTransferToGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InitiateFileTransferToGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFileTransferToGuestRequestType")
  @ResponseWrapper(localName = "InitiateFileTransferToGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InitiateFileTransferToGuestResponse")
  String initiateFileTransferToGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "guestFilePath", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "fileAttributes", targetNamespace = "urn:vim25") GuestFileAttributes paramGuestFileAttributes, @WebParam(name = "fileSize", targetNamespace = "urn:vim25") long paramLong, @WebParam(name = "overwrite", targetNamespace = "urn:vim25") boolean paramBoolean) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "StartProgramInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "StartProgramInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartProgramInGuestRequestType")
  @ResponseWrapper(localName = "StartProgramInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.StartProgramInGuestResponse")
  long startProgramInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "spec", targetNamespace = "urn:vim25") GuestProgramSpec paramGuestProgramSpec) throws FileFaultFaultMsg, GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListProcessesInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListProcessesInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListProcessesInGuestRequestType")
  @ResponseWrapper(localName = "ListProcessesInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListProcessesInGuestResponse")
  List<GuestProcessInfo> listProcessesInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "pids", targetNamespace = "urn:vim25") List<Long> paramList) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "TerminateProcessInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "TerminateProcessInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateProcessInGuestRequestType")
  @ResponseWrapper(localName = "TerminateProcessInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.TerminateProcessInGuestResponse")
  void terminateProcessInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "pid", targetNamespace = "urn:vim25") long paramLong) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ReadEnvironmentVariableInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReadEnvironmentVariableInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadEnvironmentVariableInGuestRequestType")
  @ResponseWrapper(localName = "ReadEnvironmentVariableInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReadEnvironmentVariableInGuestResponse")
  List<String> readEnvironmentVariableInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "names", targetNamespace = "urn:vim25") List<String> paramList) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "CreateRegistryKeyInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CreateRegistryKeyInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateRegistryKeyInGuestRequestType")
  @ResponseWrapper(localName = "CreateRegistryKeyInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateRegistryKeyInGuestResponse")
  void createRegistryKeyInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "keyName", targetNamespace = "urn:vim25") GuestRegKeyNameSpec paramGuestRegKeyNameSpec, @WebParam(name = "isVolatile", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "classType", targetNamespace = "urn:vim25") String paramString) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListRegistryKeysInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListRegistryKeysInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListRegistryKeysInGuestRequestType")
  @ResponseWrapper(localName = "ListRegistryKeysInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListRegistryKeysInGuestResponse")
  List<GuestRegKeyRecordSpec> listRegistryKeysInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "keyName", targetNamespace = "urn:vim25") GuestRegKeyNameSpec paramGuestRegKeyNameSpec, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "matchPattern", targetNamespace = "urn:vim25") String paramString) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "DeleteRegistryKeyInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteRegistryKeyInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteRegistryKeyInGuestRequestType")
  @ResponseWrapper(localName = "DeleteRegistryKeyInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteRegistryKeyInGuestResponse")
  void deleteRegistryKeyInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "keyName", targetNamespace = "urn:vim25") GuestRegKeyNameSpec paramGuestRegKeyNameSpec, @WebParam(name = "recursive", targetNamespace = "urn:vim25") boolean paramBoolean) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "SetRegistryValueInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetRegistryValueInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetRegistryValueInGuestRequestType")
  @ResponseWrapper(localName = "SetRegistryValueInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetRegistryValueInGuestResponse")
  void setRegistryValueInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "value", targetNamespace = "urn:vim25") GuestRegValueSpec paramGuestRegValueSpec) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "ListRegistryValuesInGuest", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListRegistryValuesInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListRegistryValuesInGuestRequestType")
  @ResponseWrapper(localName = "ListRegistryValuesInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListRegistryValuesInGuestResponse")
  List<GuestRegValueSpec> listRegistryValuesInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "keyName", targetNamespace = "urn:vim25") GuestRegKeyNameSpec paramGuestRegKeyNameSpec, @WebParam(name = "expandStrings", targetNamespace = "urn:vim25") boolean paramBoolean, @WebParam(name = "matchPattern", targetNamespace = "urn:vim25") String paramString) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "DeleteRegistryValueInGuest", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DeleteRegistryValueInGuest", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteRegistryValueInGuestRequestType")
  @ResponseWrapper(localName = "DeleteRegistryValueInGuestResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteRegistryValueInGuestResponse")
  void deleteRegistryValueInGuest(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "vm", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "auth", targetNamespace = "urn:vim25") GuestAuthentication paramGuestAuthentication, @WebParam(name = "valueName", targetNamespace = "urn:vim25") GuestRegValueNameSpec paramGuestRegValueNameSpec) throws GuestOperationsFaultFaultMsg, InvalidStateFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "HostCreateDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostCreateDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostCreateDiskRequestType")
  @ResponseWrapper(localName = "HostCreateDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostCreateDiskTaskResponse")
  ManagedObjectReference hostCreateDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmCreateSpec paramVslmCreateSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRegisterDisk", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRegisterDisk", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRegisterDiskRequestType")
  @ResponseWrapper(localName = "HostRegisterDiskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRegisterDiskResponse")
  VStorageObject hostRegisterDisk(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString2) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostExtendDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostExtendDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostExtendDiskRequestType")
  @ResponseWrapper(localName = "HostExtendDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostExtendDiskTaskResponse")
  ManagedObjectReference hostExtendDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "newCapacityInMB", targetNamespace = "urn:vim25") long paramLong) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "HostInflateDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostInflateDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostInflateDiskRequestType")
  @ResponseWrapper(localName = "HostInflateDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostInflateDiskTaskResponse")
  ManagedObjectReference hostInflateDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "HostRenameVStorageObject", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostRenameVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRenameVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostRenameVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRenameVStorageObjectResponse")
  void hostRenameVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRetrieveVStorageInfrastructureObjectPolicy", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRetrieveVStorageInfrastructureObjectPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageInfrastructureObjectPolicyRequestType")
  @ResponseWrapper(localName = "HostRetrieveVStorageInfrastructureObjectPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageInfrastructureObjectPolicyResponse")
  List<VslmInfrastructureObjectPolicy> hostRetrieveVStorageInfrastructureObjectPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostDeleteVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostDeleteVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostDeleteVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostDeleteVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostDeleteVStorageObjectTaskResponse")
  ManagedObjectReference hostDeleteVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "HostRetrieveVStorageObject", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRetrieveVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostRetrieveVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectResponse")
  VStorageObject hostRetrieveVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRetrieveVStorageObjectState", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRetrieveVStorageObjectState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectStateRequestType")
  @ResponseWrapper(localName = "HostRetrieveVStorageObjectStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectStateResponse")
  VStorageObjectStateInfo hostRetrieveVStorageObjectState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostListVStorageObject", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostListVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostListVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostListVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostListVStorageObjectResponse")
  List<ID> hostListVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostCloneVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostCloneVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostCloneVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostCloneVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostCloneVStorageObjectTaskResponse")
  ManagedObjectReference hostCloneVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmCloneSpec paramVslmCloneSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRelocateVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRelocateVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRelocateVStorageObjectRequestType")
  @ResponseWrapper(localName = "HostRelocateVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRelocateVStorageObjectTaskResponse")
  ManagedObjectReference hostRelocateVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmRelocateSpec paramVslmRelocateSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostSetVStorageObjectControlFlags", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostSetVStorageObjectControlFlags", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostSetVStorageObjectControlFlagsRequestType")
  @ResponseWrapper(localName = "HostSetVStorageObjectControlFlagsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostSetVStorageObjectControlFlagsResponse")
  void hostSetVStorageObjectControlFlags(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "controlFlags", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostClearVStorageObjectControlFlags", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostClearVStorageObjectControlFlags", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostClearVStorageObjectControlFlagsRequestType")
  @ResponseWrapper(localName = "HostClearVStorageObjectControlFlagsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostClearVStorageObjectControlFlagsResponse")
  void hostClearVStorageObjectControlFlags(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "controlFlags", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostReconcileDatastoreInventory_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostReconcileDatastoreInventory_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostReconcileDatastoreInventoryRequestType")
  @ResponseWrapper(localName = "HostReconcileDatastoreInventory_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostReconcileDatastoreInventoryTaskResponse")
  ManagedObjectReference hostReconcileDatastoreInventoryTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostScheduleReconcileDatastoreInventory", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "HostScheduleReconcileDatastoreInventory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostScheduleReconcileDatastoreInventoryRequestType")
  @ResponseWrapper(localName = "HostScheduleReconcileDatastoreInventoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostScheduleReconcileDatastoreInventoryResponse")
  void hostScheduleReconcileDatastoreInventory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostVStorageObjectCreateSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostVStorageObjectCreateSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectCreateSnapshotRequestType")
  @ResponseWrapper(localName = "HostVStorageObjectCreateSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectCreateSnapshotTaskResponse")
  ManagedObjectReference hostVStorageObjectCreateSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostVStorageObjectDeleteSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostVStorageObjectDeleteSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectDeleteSnapshotRequestType")
  @ResponseWrapper(localName = "HostVStorageObjectDeleteSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectDeleteSnapshotTaskResponse")
  ManagedObjectReference hostVStorageObjectDeleteSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostVStorageObjectRetrieveSnapshotInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostVStorageObjectRetrieveSnapshotInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectRetrieveSnapshotInfoRequestType")
  @ResponseWrapper(localName = "HostVStorageObjectRetrieveSnapshotInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectRetrieveSnapshotInfoResponse")
  VStorageObjectSnapshotInfo hostVStorageObjectRetrieveSnapshotInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostVStorageObjectCreateDiskFromSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostVStorageObjectCreateDiskFromSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectCreateDiskFromSnapshotRequestType")
  @ResponseWrapper(localName = "HostVStorageObjectCreateDiskFromSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectCreateDiskFromSnapshotTaskResponse")
  ManagedObjectReference hostVStorageObjectCreateDiskFromSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<VirtualMachineProfileSpec> paramList, @WebParam(name = "crypto", targetNamespace = "urn:vim25") CryptoSpec paramCryptoSpec, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostVStorageObjectRevert_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostVStorageObjectRevert_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectRevertRequestType")
  @ResponseWrapper(localName = "HostVStorageObjectRevert_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostVStorageObjectRevertTaskResponse")
  ManagedObjectReference hostVStorageObjectRevertTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostUpdateVStorageObjectMetadata_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostUpdateVStorageObjectMetadata_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostUpdateVStorageObjectMetadataRequestType")
  @ResponseWrapper(localName = "HostUpdateVStorageObjectMetadata_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostUpdateVStorageObjectMetadataTaskResponse")
  ManagedObjectReference hostUpdateVStorageObjectMetadataTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "metadata", targetNamespace = "urn:vim25") List<KeyValue> paramList, @WebParam(name = "deleteKeys", targetNamespace = "urn:vim25") List<String> paramList1) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRetrieveVStorageObjectMetadata", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRetrieveVStorageObjectMetadata", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectMetadataRequestType")
  @ResponseWrapper(localName = "HostRetrieveVStorageObjectMetadataResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectMetadataResponse")
  List<KeyValue> hostRetrieveVStorageObjectMetadata(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2, @WebParam(name = "prefix", targetNamespace = "urn:vim25") String paramString) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "HostRetrieveVStorageObjectMetadataValue", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "HostRetrieveVStorageObjectMetadataValue", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectMetadataValueRequestType")
  @ResponseWrapper(localName = "HostRetrieveVStorageObjectMetadataValueResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.HostRetrieveVStorageObjectMetadataValueResponse")
  String hostRetrieveVStorageObjectMetadataValue(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2, @WebParam(name = "key", targetNamespace = "urn:vim25") String paramString) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, KeyNotFoundFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiskRequestType")
  @ResponseWrapper(localName = "CreateDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiskTaskResponse")
  ManagedObjectReference createDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmCreateSpec paramVslmCreateSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RegisterDisk", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RegisterDisk", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterDiskRequestType")
  @ResponseWrapper(localName = "RegisterDiskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RegisterDiskResponse")
  VStorageObject registerDisk(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString2) throws AlreadyExistsFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ExtendDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ExtendDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendDiskRequestType")
  @ResponseWrapper(localName = "ExtendDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ExtendDiskTaskResponse")
  ManagedObjectReference extendDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "newCapacityInMB", targetNamespace = "urn:vim25") long paramLong) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "InflateDisk_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "InflateDisk_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InflateDiskRequestType")
  @ResponseWrapper(localName = "InflateDisk_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.InflateDiskTaskResponse")
  ManagedObjectReference inflateDiskTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RenameVStorageObject", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "RenameVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameVStorageObjectRequestType")
  @ResponseWrapper(localName = "RenameVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RenameVStorageObjectResponse")
  void renameVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "UpdateVStorageObjectPolicy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVStorageObjectPolicy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageObjectPolicyRequestType")
  @ResponseWrapper(localName = "UpdateVStorageObjectPolicy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageObjectPolicyTaskResponse")
  ManagedObjectReference updateVStorageObjectPolicyTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<VirtualMachineProfileSpec> paramList) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "UpdateVStorageObjectCrypto_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVStorageObjectCrypto_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageObjectCryptoRequestType")
  @ResponseWrapper(localName = "UpdateVStorageObjectCrypto_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageObjectCryptoTaskResponse")
  ManagedObjectReference updateVStorageObjectCryptoTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<VirtualMachineProfileSpec> paramList, @WebParam(name = "disksCrypto", targetNamespace = "urn:vim25") DiskCryptoSpec paramDiskCryptoSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "UpdateVStorageInfrastructureObjectPolicy_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "UpdateVStorageInfrastructureObjectPolicy_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageInfrastructureObjectPolicyRequestType")
  @ResponseWrapper(localName = "UpdateVStorageInfrastructureObjectPolicy_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.UpdateVStorageInfrastructureObjectPolicyTaskResponse")
  ManagedObjectReference updateVStorageInfrastructureObjectPolicyTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmInfrastructureObjectPolicySpec paramVslmInfrastructureObjectPolicySpec) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RetrieveVStorageInfrastructureObjectPolicy", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveVStorageInfrastructureObjectPolicy", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageInfrastructureObjectPolicyRequestType")
  @ResponseWrapper(localName = "RetrieveVStorageInfrastructureObjectPolicyResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageInfrastructureObjectPolicyResponse")
  List<VslmInfrastructureObjectPolicy> retrieveVStorageInfrastructureObjectPolicy(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVStorageObjectRequestType")
  @ResponseWrapper(localName = "DeleteVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteVStorageObjectTaskResponse")
  ManagedObjectReference deleteVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg, TaskInProgressFaultMsg;
  
  @WebMethod(operationName = "RetrieveVStorageObject", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectRequestType")
  @ResponseWrapper(localName = "RetrieveVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectResponse")
  VStorageObject retrieveVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveVStorageObjectState", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveVStorageObjectState", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectStateRequestType")
  @ResponseWrapper(localName = "RetrieveVStorageObjectStateResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectStateResponse")
  VStorageObjectStateInfo retrieveVStorageObjectState(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveVStorageObjectAssociations", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveVStorageObjectAssociations", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectAssociationsRequestType")
  @ResponseWrapper(localName = "RetrieveVStorageObjectAssociationsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveVStorageObjectAssociationsResponse")
  List<VStorageObjectAssociations> retrieveVStorageObjectAssociations(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "ids", targetNamespace = "urn:vim25") List<RetrieveVStorageObjSpec> paramList) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListVStorageObject", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListVStorageObjectRequestType")
  @ResponseWrapper(localName = "ListVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListVStorageObjectResponse")
  List<ID> listVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CloneVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CloneVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVStorageObjectRequestType")
  @ResponseWrapper(localName = "CloneVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CloneVStorageObjectTaskResponse")
  ManagedObjectReference cloneVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmCloneSpec paramVslmCloneSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RelocateVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RelocateVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RelocateVStorageObjectRequestType")
  @ResponseWrapper(localName = "RelocateVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RelocateVStorageObjectTaskResponse")
  ManagedObjectReference relocateVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "spec", targetNamespace = "urn:vim25") VslmRelocateSpec paramVslmRelocateSpec) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "SetVStorageObjectControlFlags", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "SetVStorageObjectControlFlags", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetVStorageObjectControlFlagsRequestType")
  @ResponseWrapper(localName = "SetVStorageObjectControlFlagsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.SetVStorageObjectControlFlagsResponse")
  void setVStorageObjectControlFlags(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "controlFlags", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ClearVStorageObjectControlFlags", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ClearVStorageObjectControlFlags", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearVStorageObjectControlFlagsRequestType")
  @ResponseWrapper(localName = "ClearVStorageObjectControlFlagsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ClearVStorageObjectControlFlagsResponse")
  void clearVStorageObjectControlFlags(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "controlFlags", targetNamespace = "urn:vim25") List<String> paramList) throws InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "AttachTagToVStorageObject", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "AttachTagToVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachTagToVStorageObjectRequestType")
  @ResponseWrapper(localName = "AttachTagToVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.AttachTagToVStorageObjectResponse")
  void attachTagToVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "category", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "tag", targetNamespace = "urn:vim25") String paramString2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DetachTagFromVStorageObject", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DetachTagFromVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachTagFromVStorageObjectRequestType")
  @ResponseWrapper(localName = "DetachTagFromVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DetachTagFromVStorageObjectResponse")
  void detachTagFromVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "category", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "tag", targetNamespace = "urn:vim25") String paramString2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListVStorageObjectsAttachedToTag", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListVStorageObjectsAttachedToTag", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListVStorageObjectsAttachedToTagRequestType")
  @ResponseWrapper(localName = "ListVStorageObjectsAttachedToTagResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListVStorageObjectsAttachedToTagResponse")
  List<ID> listVStorageObjectsAttachedToTag(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "category", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "tag", targetNamespace = "urn:vim25") String paramString2) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ListTagsAttachedToVStorageObject", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ListTagsAttachedToVStorageObject", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListTagsAttachedToVStorageObjectRequestType")
  @ResponseWrapper(localName = "ListTagsAttachedToVStorageObjectResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ListTagsAttachedToVStorageObjectResponse")
  List<VslmTagEntry> listTagsAttachedToVStorageObject(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID) throws NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ReconcileDatastoreInventory_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ReconcileDatastoreInventory_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconcileDatastoreInventoryRequestType")
  @ResponseWrapper(localName = "ReconcileDatastoreInventory_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ReconcileDatastoreInventoryTaskResponse")
  ManagedObjectReference reconcileDatastoreInventoryTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ScheduleReconcileDatastoreInventory", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "ScheduleReconcileDatastoreInventory", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScheduleReconcileDatastoreInventoryRequestType")
  @ResponseWrapper(localName = "ScheduleReconcileDatastoreInventoryResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ScheduleReconcileDatastoreInventoryResponse")
  void scheduleReconcileDatastoreInventory(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws InvalidDatastoreFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "VStorageObjectCreateSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "VStorageObjectCreateSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.VStorageObjectCreateSnapshotRequestType")
  @ResponseWrapper(localName = "VStorageObjectCreateSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.VStorageObjectCreateSnapshotTaskResponse")
  ManagedObjectReference vStorageObjectCreateSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "description", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DeleteSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "DeleteSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteSnapshotRequestType")
  @ResponseWrapper(localName = "DeleteSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DeleteSnapshotTaskResponse")
  ManagedObjectReference deleteSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveSnapshotInfo", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveSnapshotInfo", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSnapshotInfoRequestType")
  @ResponseWrapper(localName = "RetrieveSnapshotInfoResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSnapshotInfoResponse")
  VStorageObjectSnapshotInfo retrieveSnapshotInfo(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateDiskFromSnapshot_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateDiskFromSnapshot_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiskFromSnapshotRequestType")
  @ResponseWrapper(localName = "CreateDiskFromSnapshot_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateDiskFromSnapshotTaskResponse")
  ManagedObjectReference createDiskFromSnapshotTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2, @WebParam(name = "name", targetNamespace = "urn:vim25") String paramString1, @WebParam(name = "profile", targetNamespace = "urn:vim25") List<VirtualMachineProfileSpec> paramList, @WebParam(name = "crypto", targetNamespace = "urn:vim25") CryptoSpec paramCryptoSpec, @WebParam(name = "path", targetNamespace = "urn:vim25") String paramString2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RevertVStorageObject_Task", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RevertVStorageObject_Task", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertVStorageObjectRequestType")
  @ResponseWrapper(localName = "RevertVStorageObject_TaskResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RevertVStorageObjectTaskResponse")
  ManagedObjectReference revertVStorageObjectTask(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveSnapshotDetails", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveSnapshotDetails", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSnapshotDetailsRequestType")
  @ResponseWrapper(localName = "RetrieveSnapshotDetailsResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrieveSnapshotDetailsResponse")
  VStorageObjectSnapshotDetails retrieveSnapshotDetails(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2) throws FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "VstorageObjectVCenterQueryChangedDiskAreas", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "VstorageObjectVCenterQueryChangedDiskAreas", targetNamespace = "urn:vim25", className = "com.vmware.vim25.VstorageObjectVCenterQueryChangedDiskAreasRequestType")
  @ResponseWrapper(localName = "VstorageObjectVCenterQueryChangedDiskAreasResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.VstorageObjectVCenterQueryChangedDiskAreasResponse")
  DiskChangeInfo vstorageObjectVCenterQueryChangedDiskAreas(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference1, @WebParam(name = "id", targetNamespace = "urn:vim25") ID paramID1, @WebParam(name = "datastore", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference2, @WebParam(name = "snapshotId", targetNamespace = "urn:vim25") ID paramID2, @WebParam(name = "startOffset", targetNamespace = "urn:vim25") long paramLong, @WebParam(name = "changeId", targetNamespace = "urn:vim25") String paramString) throws FileFaultFaultMsg, InvalidArgumentFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg, NotFoundFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreateFilter", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreateFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateFilterRequestType")
  @ResponseWrapper(localName = "CreateFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreateFilterResponse")
  ManagedObjectReference createFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "spec", targetNamespace = "urn:vim25") PropertyFilterSpec paramPropertyFilterSpec, @WebParam(name = "partialUpdates", targetNamespace = "urn:vim25") boolean paramBoolean) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrieveProperties", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrieveProperties", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrievePropertiesRequestType")
  @ResponseWrapper(localName = "RetrievePropertiesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrievePropertiesResponse")
  List<ObjectContent> retrieveProperties(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "specSet", targetNamespace = "urn:vim25") List<PropertyFilterSpec> paramList) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CheckForUpdates", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CheckForUpdates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckForUpdatesRequestType")
  @ResponseWrapper(localName = "CheckForUpdatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CheckForUpdatesResponse")
  UpdateSet checkForUpdates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "version", targetNamespace = "urn:vim25") String paramString) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "WaitForUpdates", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "WaitForUpdates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.WaitForUpdatesRequestType")
  @ResponseWrapper(localName = "WaitForUpdatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.WaitForUpdatesResponse")
  UpdateSet waitForUpdates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "version", targetNamespace = "urn:vim25") String paramString) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CancelWaitForUpdates", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CancelWaitForUpdates", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelWaitForUpdatesRequestType")
  @ResponseWrapper(localName = "CancelWaitForUpdatesResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelWaitForUpdatesResponse")
  void cancelWaitForUpdates(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "WaitForUpdatesEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "WaitForUpdatesEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.WaitForUpdatesExRequestType")
  @ResponseWrapper(localName = "WaitForUpdatesExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.WaitForUpdatesExResponse")
  UpdateSet waitForUpdatesEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "version", targetNamespace = "urn:vim25") String paramString, @WebParam(name = "options", targetNamespace = "urn:vim25") WaitOptions paramWaitOptions) throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "RetrievePropertiesEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "RetrievePropertiesEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrievePropertiesExRequestType")
  @ResponseWrapper(localName = "RetrievePropertiesExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.RetrievePropertiesExResponse")
  RetrieveResult retrievePropertiesEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "specSet", targetNamespace = "urn:vim25") List<PropertyFilterSpec> paramList, @WebParam(name = "options", targetNamespace = "urn:vim25") RetrieveOptions paramRetrieveOptions) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "ContinueRetrievePropertiesEx", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "ContinueRetrievePropertiesEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ContinueRetrievePropertiesExRequestType")
  @ResponseWrapper(localName = "ContinueRetrievePropertiesExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.ContinueRetrievePropertiesExResponse")
  RetrieveResult continueRetrievePropertiesEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "token", targetNamespace = "urn:vim25") String paramString) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CancelRetrievePropertiesEx", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "CancelRetrievePropertiesEx", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelRetrievePropertiesExRequestType")
  @ResponseWrapper(localName = "CancelRetrievePropertiesExResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CancelRetrievePropertiesExResponse")
  void cancelRetrievePropertiesEx(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference, @WebParam(name = "token", targetNamespace = "urn:vim25") String paramString) throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "CreatePropertyCollector", action = "urn:vim25/s55741")
  @WebResult(name = "returnval", targetNamespace = "urn:vim25")
  @RequestWrapper(localName = "CreatePropertyCollector", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePropertyCollectorRequestType")
  @ResponseWrapper(localName = "CreatePropertyCollectorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.CreatePropertyCollectorResponse")
  ManagedObjectReference createPropertyCollector(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyPropertyCollector", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyPropertyCollector", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyPropertyCollectorRequestType")
  @ResponseWrapper(localName = "DestroyPropertyCollectorResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyPropertyCollectorResponse")
  void destroyPropertyCollector(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
  
  @WebMethod(operationName = "DestroyPropertyFilter", action = "urn:vim25/s55741")
  @RequestWrapper(localName = "DestroyPropertyFilter", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyPropertyFilterRequestType")
  @ResponseWrapper(localName = "DestroyPropertyFilterResponse", targetNamespace = "urn:vim25", className = "com.vmware.vim25.DestroyPropertyFilterResponse")
  void destroyPropertyFilter(@WebParam(name = "_this", targetNamespace = "urn:vim25") ManagedObjectReference paramManagedObjectReference) throws RuntimeFaultFaultMsg;
}
