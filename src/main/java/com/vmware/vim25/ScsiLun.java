package com.vmware.vim25;

import com.vmware.vim25.HostDevice;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.ScsiLun;
import com.vmware.vim25.ScsiLunCapabilities;
import com.vmware.vim25.ScsiLunDescriptor;
import com.vmware.vim25.ScsiLunDurableName;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLun", propOrder = {"key", "uuid", "descriptor", "canonicalName", "displayName", "lunType", "vendor", "model", "revision", "scsiLevel", "serialNumber", "durableName", "alternateName", "standardInquiry", "queueDepth", "operationalState", "capabilities", "vStorageSupport", "protocolEndpoint", "perenniallyReserved", "clusteredVmdkSupported"})
@XmlSeeAlso({HostScsiDisk.class})
public class ScsiLun extends HostDevice {
  protected String key;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected List<ScsiLunDescriptor> descriptor;
  
  protected String canonicalName;
  
  protected String displayName;
  
  @XmlElement(required = true)
  protected String lunType;
  
  protected String vendor;
  
  protected String model;
  
  protected String revision;
  
  protected Integer scsiLevel;
  
  protected String serialNumber;
  
  protected ScsiLunDurableName durableName;
  
  protected List<ScsiLunDurableName> alternateName;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> standardInquiry;
  
  protected Integer queueDepth;
  
  @XmlElement(required = true)
  protected List<String> operationalState;
  
  protected ScsiLunCapabilities capabilities;
  
  protected String vStorageSupport;
  
  protected Boolean protocolEndpoint;
  
  protected Boolean perenniallyReserved;
  
  protected Boolean clusteredVmdkSupported;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<ScsiLunDescriptor> getDescriptor() {
    if (this.descriptor == null)
      this.descriptor = new ArrayList<>(); 
    return this.descriptor;
  }
  
  public String getCanonicalName() {
    return this.canonicalName;
  }
  
  public void setCanonicalName(String paramString) {
    this.canonicalName = paramString;
  }
  
  public String getDisplayName() {
    return this.displayName;
  }
  
  public void setDisplayName(String paramString) {
    this.displayName = paramString;
  }
  
  public String getLunType() {
    return this.lunType;
  }
  
  public void setLunType(String paramString) {
    this.lunType = paramString;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String paramString) {
    this.model = paramString;
  }
  
  public String getRevision() {
    return this.revision;
  }
  
  public void setRevision(String paramString) {
    this.revision = paramString;
  }
  
  public Integer getScsiLevel() {
    return this.scsiLevel;
  }
  
  public void setScsiLevel(Integer paramInteger) {
    this.scsiLevel = paramInteger;
  }
  
  public String getSerialNumber() {
    return this.serialNumber;
  }
  
  public void setSerialNumber(String paramString) {
    this.serialNumber = paramString;
  }
  
  public ScsiLunDurableName getDurableName() {
    return this.durableName;
  }
  
  public void setDurableName(ScsiLunDurableName paramScsiLunDurableName) {
    this.durableName = paramScsiLunDurableName;
  }
  
  public List<ScsiLunDurableName> getAlternateName() {
    if (this.alternateName == null)
      this.alternateName = new ArrayList<>(); 
    return this.alternateName;
  }
  
  public List<Byte> getStandardInquiry() {
    if (this.standardInquiry == null)
      this.standardInquiry = new ArrayList<>(); 
    return this.standardInquiry;
  }
  
  public Integer getQueueDepth() {
    return this.queueDepth;
  }
  
  public void setQueueDepth(Integer paramInteger) {
    this.queueDepth = paramInteger;
  }
  
  public List<String> getOperationalState() {
    if (this.operationalState == null)
      this.operationalState = new ArrayList<>(); 
    return this.operationalState;
  }
  
  public ScsiLunCapabilities getCapabilities() {
    return this.capabilities;
  }
  
  public void setCapabilities(ScsiLunCapabilities paramScsiLunCapabilities) {
    this.capabilities = paramScsiLunCapabilities;
  }
  
  public String getVStorageSupport() {
    return this.vStorageSupport;
  }
  
  public void setVStorageSupport(String paramString) {
    this.vStorageSupport = paramString;
  }
  
  public Boolean isProtocolEndpoint() {
    return this.protocolEndpoint;
  }
  
  public void setProtocolEndpoint(Boolean paramBoolean) {
    this.protocolEndpoint = paramBoolean;
  }
  
  public Boolean isPerenniallyReserved() {
    return this.perenniallyReserved;
  }
  
  public void setPerenniallyReserved(Boolean paramBoolean) {
    this.perenniallyReserved = paramBoolean;
  }
  
  public Boolean isClusteredVmdkSupported() {
    return this.clusteredVmdkSupported;
  }
  
  public void setClusteredVmdkSupported(Boolean paramBoolean) {
    this.clusteredVmdkSupported = paramBoolean;
  }
}
