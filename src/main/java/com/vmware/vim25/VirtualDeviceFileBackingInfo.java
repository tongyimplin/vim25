package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualCdromIsoBackingInfo;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer1BackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualDiskLocalPMemBackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSeSparseBackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer2BackingInfo;
import com.vmware.vim25.VirtualFloppyImageBackingInfo;
import com.vmware.vim25.VirtualNVDIMMBackingInfo;
import com.vmware.vim25.VirtualParallelPortFileBackingInfo;
import com.vmware.vim25.VirtualSerialPortFileBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceFileBackingInfo", propOrder = {"fileName", "datastore", "backingObjectId"})
@XmlSeeAlso({VirtualParallelPortFileBackingInfo.class, VirtualDiskSparseVer1BackingInfo.class, VirtualNVDIMMBackingInfo.class, VirtualDiskLocalPMemBackingInfo.class, VirtualCdromIsoBackingInfo.class, VirtualFloppyImageBackingInfo.class, VirtualDiskFlatVer1BackingInfo.class, VirtualDiskFlatVer2BackingInfo.class, VirtualDiskRawDiskMappingVer1BackingInfo.class, VirtualDiskSeSparseBackingInfo.class, VirtualDiskSparseVer2BackingInfo.class, VirtualSerialPortFileBackingInfo.class})
public class VirtualDeviceFileBackingInfo extends VirtualDeviceBackingInfo {
  @XmlElement(required = true)
  protected String fileName;
  
  protected ManagedObjectReference datastore;
  
  protected String backingObjectId;
  
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(String paramString) {
    this.fileName = paramString;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getBackingObjectId() {
    return this.backingObjectId;
  }
  
  public void setBackingObjectId(String paramString) {
    this.backingObjectId = paramString;
  }
}
