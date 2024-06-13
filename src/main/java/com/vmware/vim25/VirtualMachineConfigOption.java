package com.vmware.vim25;

import com.vmware.vim25.DatastoreOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestOsDescriptor;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualHardwareOption;
import com.vmware.vim25.VirtualMachineCapability;
import com.vmware.vim25.VirtualMachineConfigOption;
import com.vmware.vim25.VirtualMachinePropertyRelation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigOption", propOrder = {"version", "description", "guestOSDescriptor", "guestOSDefaultIndex", "hardwareOptions", "capabilities", "datastore", "defaultDevice", "supportedMonitorType", "supportedOvfEnvironmentTransport", "supportedOvfInstallTransport", "propertyRelations"})
public class VirtualMachineConfigOption extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String description;
  
  @XmlElement(required = true)
  protected List<GuestOsDescriptor> guestOSDescriptor;
  
  protected int guestOSDefaultIndex;
  
  @XmlElement(required = true)
  protected VirtualHardwareOption hardwareOptions;
  
  @XmlElement(required = true)
  protected VirtualMachineCapability capabilities;
  
  @XmlElement(required = true)
  protected DatastoreOption datastore;
  
  protected List<VirtualDevice> defaultDevice;
  
  @XmlElement(required = true)
  protected List<String> supportedMonitorType;
  
  protected List<String> supportedOvfEnvironmentTransport;
  
  protected List<String> supportedOvfInstallTransport;
  
  protected List<VirtualMachinePropertyRelation> propertyRelations;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public List<GuestOsDescriptor> getGuestOSDescriptor() {
    if (this.guestOSDescriptor == null)
      this.guestOSDescriptor = new ArrayList<>(); 
    return this.guestOSDescriptor;
  }
  
  public int getGuestOSDefaultIndex() {
    return this.guestOSDefaultIndex;
  }
  
  public void setGuestOSDefaultIndex(int paramInt) {
    this.guestOSDefaultIndex = paramInt;
  }
  
  public VirtualHardwareOption getHardwareOptions() {
    return this.hardwareOptions;
  }
  
  public void setHardwareOptions(VirtualHardwareOption paramVirtualHardwareOption) {
    this.hardwareOptions = paramVirtualHardwareOption;
  }
  
  public VirtualMachineCapability getCapabilities() {
    return this.capabilities;
  }
  
  public void setCapabilities(VirtualMachineCapability paramVirtualMachineCapability) {
    this.capabilities = paramVirtualMachineCapability;
  }
  
  public DatastoreOption getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreOption paramDatastoreOption) {
    this.datastore = paramDatastoreOption;
  }
  
  public List<VirtualDevice> getDefaultDevice() {
    if (this.defaultDevice == null)
      this.defaultDevice = new ArrayList<>(); 
    return this.defaultDevice;
  }
  
  public List<String> getSupportedMonitorType() {
    if (this.supportedMonitorType == null)
      this.supportedMonitorType = new ArrayList<>(); 
    return this.supportedMonitorType;
  }
  
  public List<String> getSupportedOvfEnvironmentTransport() {
    if (this.supportedOvfEnvironmentTransport == null)
      this.supportedOvfEnvironmentTransport = new ArrayList<>(); 
    return this.supportedOvfEnvironmentTransport;
  }
  
  public List<String> getSupportedOvfInstallTransport() {
    if (this.supportedOvfInstallTransport == null)
      this.supportedOvfInstallTransport = new ArrayList<>(); 
    return this.supportedOvfInstallTransport;
  }
  
  public List<VirtualMachinePropertyRelation> getPropertyRelations() {
    if (this.propertyRelations == null)
      this.propertyRelations = new ArrayList<>(); 
    return this.propertyRelations;
  }
}
