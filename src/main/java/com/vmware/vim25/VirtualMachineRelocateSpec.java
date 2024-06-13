package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceLocator;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocator;
import com.vmware.vim25.VirtualMachineRelocateTransformation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpec", propOrder = {"service", "folder", "datastore", "diskMoveType", "pool", "host", "disk", "transform", "deviceChange", "profile", "cryptoSpec"})
public class VirtualMachineRelocateSpec extends DynamicData {
  protected ServiceLocator service;
  
  protected ManagedObjectReference folder;
  
  protected ManagedObjectReference datastore;
  
  protected String diskMoveType;
  
  protected ManagedObjectReference pool;
  
  protected ManagedObjectReference host;
  
  protected List<VirtualMachineRelocateSpecDiskLocator> disk;
  
  protected VirtualMachineRelocateTransformation transform;
  
  protected List<VirtualDeviceConfigSpec> deviceChange;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected CryptoSpec cryptoSpec;
  
  public ServiceLocator getService() {
    return this.service;
  }
  
  public void setService(ServiceLocator paramServiceLocator) {
    this.service = paramServiceLocator;
  }
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getDiskMoveType() {
    return this.diskMoveType;
  }
  
  public void setDiskMoveType(String paramString) {
    this.diskMoveType = paramString;
  }
  
  public ManagedObjectReference getPool() {
    return this.pool;
  }
  
  public void setPool(ManagedObjectReference paramManagedObjectReference) {
    this.pool = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<VirtualMachineRelocateSpecDiskLocator> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public VirtualMachineRelocateTransformation getTransform() {
    return this.transform;
  }
  
  public void setTransform(VirtualMachineRelocateTransformation paramVirtualMachineRelocateTransformation) {
    this.transform = paramVirtualMachineRelocateTransformation;
  }
  
  public List<VirtualDeviceConfigSpec> getDeviceChange() {
    if (this.deviceChange == null)
      this.deviceChange = new ArrayList<>(); 
    return this.deviceChange;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public CryptoSpec getCryptoSpec() {
    return this.cryptoSpec;
  }
  
  public void setCryptoSpec(CryptoSpec paramCryptoSpec) {
    this.cryptoSpec = paramCryptoSpec;
  }
}
