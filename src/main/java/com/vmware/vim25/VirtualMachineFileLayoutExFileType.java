package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFileLayoutExFileType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFileLayoutExFileType")
@XmlEnum
public enum VirtualMachineFileLayoutExFileType {
  CONFIG("config"),
  EXTENDED_CONFIG("extendedConfig"),
  DISK_DESCRIPTOR("diskDescriptor"),
  DISK_EXTENT("diskExtent"),
  DIGEST_DESCRIPTOR("digestDescriptor"),
  DIGEST_EXTENT("digestExtent"),
  DISK_REPLICATION_STATE("diskReplicationState"),
  LOG("log"),
  STAT("stat"),
  NAMESPACE_DATA("namespaceData"),
  NVRAM("nvram"),
  SNAPSHOT_DATA("snapshotData"),
  SNAPSHOT_MEMORY("snapshotMemory"),
  SNAPSHOT_LIST("snapshotList"),
  SNAPSHOT_MANIFEST_LIST("snapshotManifestList"),
  SUSPEND("suspend"),
  SUSPEND_MEMORY("suspendMemory"),
  SWAP("swap"),
  UWSWAP("uwswap"),
  CORE("core"),
  SCREENSHOT("screenshot"),
  FT_METADATA("ftMetadata"),
  GUEST_CUSTOMIZATION("guestCustomization");
  
  private final String value;
  
  VirtualMachineFileLayoutExFileType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFileLayoutExFileType fromValue(String paramString) {
    for (VirtualMachineFileLayoutExFileType virtualMachineFileLayoutExFileType : values()) {
      if (virtualMachineFileLayoutExFileType.value.equals(paramString))
        return virtualMachineFileLayoutExFileType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
