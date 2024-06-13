package com.vmware.vim25;

import com.vmware.vim25.CannotChangeDrsBehaviorForFtSecondary;
import com.vmware.vim25.CannotChangeHaSettingsForFtSecondary;
import com.vmware.vim25.CannotComputeFTCompatibleHosts;
import com.vmware.vim25.FaultToleranceNotLicensed;
import com.vmware.vim25.FaultTolerancePrimaryPowerOnNotAttempted;
import com.vmware.vim25.FtIssuesOnHost;
import com.vmware.vim25.HostIncompatibleForFaultTolerance;
import com.vmware.vim25.IncompatibleHostForFtSecondary;
import com.vmware.vim25.InvalidOperationOnSecondaryVm;
import com.vmware.vim25.NoHostSuitableForFtSecondary;
import com.vmware.vim25.NotSupportedDeviceForFT;
import com.vmware.vim25.PowerOnFtSecondaryFailed;
import com.vmware.vim25.SecondaryVmAlreadyDisabled;
import com.vmware.vim25.SecondaryVmAlreadyEnabled;
import com.vmware.vim25.SecondaryVmAlreadyRegistered;
import com.vmware.vim25.SecondaryVmNotRegistered;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmFaultToleranceConfigIssue;
import com.vmware.vim25.VmFaultToleranceConfigIssueWrapper;
import com.vmware.vim25.VmFaultToleranceInvalidFileBacking;
import com.vmware.vim25.VmFaultToleranceOpIssuesList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceIssue")
@XmlSeeAlso({SecondaryVmAlreadyEnabled.class, VmFaultToleranceOpIssuesList.class, CannotChangeHaSettingsForFtSecondary.class, VmFaultToleranceConfigIssueWrapper.class, VmFaultToleranceInvalidFileBacking.class, NoHostSuitableForFtSecondary.class, VmFaultToleranceConfigIssue.class, FaultTolerancePrimaryPowerOnNotAttempted.class, FtIssuesOnHost.class, CannotComputeFTCompatibleHosts.class, CannotChangeDrsBehaviorForFtSecondary.class, InvalidOperationOnSecondaryVm.class, IncompatibleHostForFtSecondary.class, NotSupportedDeviceForFT.class, SecondaryVmAlreadyDisabled.class, FaultToleranceNotLicensed.class, HostIncompatibleForFaultTolerance.class, SecondaryVmAlreadyRegistered.class, PowerOnFtSecondaryFailed.class, SecondaryVmNotRegistered.class})
public class VmFaultToleranceIssue extends VimFault {}
