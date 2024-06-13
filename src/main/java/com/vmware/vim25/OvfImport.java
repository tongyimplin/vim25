package com.vmware.vim25;

import com.vmware.vim25.OvfCpuCompatibility;
import com.vmware.vim25.OvfCpuCompatibilityCheckNotSupported;
import com.vmware.vim25.OvfFault;
import com.vmware.vim25.OvfHardwareCheck;
import com.vmware.vim25.OvfImportFailed;
import com.vmware.vim25.OvfMappedOsId;
import com.vmware.vim25.OvfMissingHardware;
import com.vmware.vim25.OvfNetworkMappingNotSupported;
import com.vmware.vim25.OvfUnsupportedDiskProvisioning;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfImport")
@XmlSeeAlso({OvfMappedOsId.class, OvfCpuCompatibilityCheckNotSupported.class, OvfUnsupportedDiskProvisioning.class, OvfHardwareCheck.class, OvfCpuCompatibility.class, OvfNetworkMappingNotSupported.class, OvfImportFailed.class, OvfMissingHardware.class})
public class OvfImport extends OvfFault {}
