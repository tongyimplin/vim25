package com.vmware.vim25;

import com.vmware.vim25.CannotAccessVmComponent;
import com.vmware.vim25.CannotDisableSnapshot;
import com.vmware.vim25.CannotUseNetwork;
import com.vmware.vim25.CpuHotPlugNotSupported;
import com.vmware.vim25.DeltaDiskFormatNotSupported;
import com.vmware.vim25.EightHostLimitViolated;
import com.vmware.vim25.FaultToleranceCannotEditMem;
import com.vmware.vim25.GenericVmConfigFault;
import com.vmware.vim25.InvalidFormat;
import com.vmware.vim25.InvalidVmConfig;
import com.vmware.vim25.LargeRDMNotSupportedOnDatastore;
import com.vmware.vim25.MemoryHotPlugNotSupported;
import com.vmware.vim25.NoCompatibleHardAffinityHost;
import com.vmware.vim25.NoCompatibleSoftAffinityHost;
import com.vmware.vim25.NumVirtualCpusIncompatible;
import com.vmware.vim25.OvfConsumerValidationFault;
import com.vmware.vim25.QuarantineModeFault;
import com.vmware.vim25.RDMNotSupportedOnDatastore;
import com.vmware.vim25.RuleViolation;
import com.vmware.vim25.SoftRuleVioCorrectionDisallowed;
import com.vmware.vim25.SoftRuleVioCorrectionImpact;
import com.vmware.vim25.UnsupportedDatastore;
import com.vmware.vim25.UnsupportedVmxLocation;
import com.vmware.vim25.VAppNotRunning;
import com.vmware.vim25.VAppPropertyFault;
import com.vmware.vim25.VFlashCacheHotConfigNotSupported;
import com.vmware.vim25.VFlashModuleNotSupported;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import com.vmware.vim25.VmConfigIncompatibleForFaultTolerance;
import com.vmware.vim25.VmConfigIncompatibleForRecordReplay;
import com.vmware.vim25.VmHostAffinityRuleViolation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFault")
@XmlSeeAlso({CpuHotPlugNotSupported.class, VAppNotRunning.class, FaultToleranceCannotEditMem.class, MemoryHotPlugNotSupported.class, RuleViolation.class, EightHostLimitViolated.class, NumVirtualCpusIncompatible.class, VFlashCacheHotConfigNotSupported.class, VmConfigIncompatibleForRecordReplay.class, QuarantineModeFault.class, NoCompatibleHardAffinityHost.class, VFlashModuleNotSupported.class, NoCompatibleSoftAffinityHost.class, VmHostAffinityRuleViolation.class, CannotUseNetwork.class, OvfConsumerValidationFault.class, UnsupportedVmxLocation.class, CannotDisableSnapshot.class, SoftRuleVioCorrectionDisallowed.class, GenericVmConfigFault.class, LargeRDMNotSupportedOnDatastore.class, InvalidFormat.class, UnsupportedDatastore.class, RDMNotSupportedOnDatastore.class, VmConfigIncompatibleForFaultTolerance.class, DeltaDiskFormatNotSupported.class, CannotAccessVmComponent.class, VAppPropertyFault.class, VirtualHardwareCompatibilityIssue.class, InvalidVmConfig.class, SoftRuleVioCorrectionImpact.class})
public class VmConfigFault extends VimFault {}
