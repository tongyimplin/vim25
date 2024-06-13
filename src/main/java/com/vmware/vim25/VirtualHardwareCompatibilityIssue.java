package com.vmware.vim25;

import com.vmware.vim25.CpuIncompatible;
import com.vmware.vim25.DeviceNotSupported;
import com.vmware.vim25.DiskNotSupported;
import com.vmware.vim25.DrsVmotionIncompatibleFault;
import com.vmware.vim25.FeatureRequirementsNotMet;
import com.vmware.vim25.MemorySizeNotRecommended;
import com.vmware.vim25.MemorySizeNotSupported;
import com.vmware.vim25.MemorySizeNotSupportedByDatastore;
import com.vmware.vim25.NotEnoughCpus;
import com.vmware.vim25.NumVirtualCoresPerSocketNotSupported;
import com.vmware.vim25.NumVirtualCpusNotSupported;
import com.vmware.vim25.StorageVmotionIncompatible;
import com.vmware.vim25.VirtualHardwareVersionNotSupported;
import com.vmware.vim25.VmConfigFault;
import com.vmware.vim25.WakeOnLanNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardwareCompatibilityIssue")
@XmlSeeAlso({WakeOnLanNotSupported.class, MemorySizeNotRecommended.class, StorageVmotionIncompatible.class, NumVirtualCpusNotSupported.class, FeatureRequirementsNotMet.class, NumVirtualCoresPerSocketNotSupported.class, CpuIncompatible.class, NotEnoughCpus.class, MemorySizeNotSupported.class, DiskNotSupported.class, VirtualHardwareVersionNotSupported.class, DrsVmotionIncompatibleFault.class, MemorySizeNotSupportedByDatastore.class, DeviceNotSupported.class})
public class VirtualHardwareCompatibilityIssue extends VmConfigFault {}
