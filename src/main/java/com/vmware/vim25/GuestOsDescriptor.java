package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestOsDescriptor;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.IntOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestOsDescriptor", propOrder = {"id", "family", "fullName", "supportedMaxCPUs", "numSupportedPhysicalSockets", "numSupportedCoresPerSocket", "supportedMinMemMB", "supportedMaxMemMB", "recommendedMemMB", "recommendedColorDepth", "supportedDiskControllerList", "recommendedSCSIController", "recommendedDiskController", "supportedNumDisks", "recommendedDiskSizeMB", "recommendedCdromController", "supportedEthernetCard", "recommendedEthernetCard", "supportsSlaveDisk", "cpuFeatureMask", "smcRequired", "supportsWakeOnLan", "supportsVMI", "supportsMemoryHotAdd", "supportsCpuHotAdd", "supportsCpuHotRemove", "supportedFirmware", "recommendedFirmware", "supportedUSBControllerList", "recommendedUSBController", "supports3D", "recommended3D", "smcRecommended", "ich7MRecommended", "usbRecommended", "supportLevel", "supportedForCreate", "vramSizeInKB", "numSupportedFloppyDevices", "wakeOnLanEthernetCard", "supportsPvscsiControllerForBoot", "diskUuidEnabled", "supportsHotPlugPCI", "supportsSecureBoot", "defaultSecureBoot", "persistentMemorySupported", "supportedMinPersistentMemoryMB", "supportedMaxPersistentMemoryMB", "recommendedPersistentMemoryMB", "persistentMemoryHotAddSupported", "persistentMemoryHotRemoveSupported", "persistentMemoryColdGrowthSupported", "persistentMemoryColdGrowthGranularityMB", "persistentMemoryHotGrowthSupported", "persistentMemoryHotGrowthGranularityMB", "numRecommendedPhysicalSockets", "numRecommendedCoresPerSocket", "vvtdSupported", "vbsSupported", "vsgxSupported", "supportsTPM20", "vwdtSupported"})
public class GuestOsDescriptor extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String family;
  
  @XmlElement(required = true)
  protected String fullName;
  
  protected int supportedMaxCPUs;
  
  protected Integer numSupportedPhysicalSockets;
  
  protected Integer numSupportedCoresPerSocket;
  
  protected int supportedMinMemMB;
  
  protected int supportedMaxMemMB;
  
  protected int recommendedMemMB;
  
  protected int recommendedColorDepth;
  
  @XmlElement(required = true)
  protected List<String> supportedDiskControllerList;
  
  protected String recommendedSCSIController;
  
  @XmlElement(required = true)
  protected String recommendedDiskController;
  
  protected int supportedNumDisks;
  
  protected int recommendedDiskSizeMB;
  
  protected String recommendedCdromController;
  
  @XmlElement(required = true)
  protected List<String> supportedEthernetCard;
  
  protected String recommendedEthernetCard;
  
  protected Boolean supportsSlaveDisk;
  
  protected List<HostCpuIdInfo> cpuFeatureMask;
  
  protected Boolean smcRequired;
  
  protected boolean supportsWakeOnLan;
  
  protected Boolean supportsVMI;
  
  protected Boolean supportsMemoryHotAdd;
  
  protected Boolean supportsCpuHotAdd;
  
  protected Boolean supportsCpuHotRemove;
  
  protected List<String> supportedFirmware;
  
  protected String recommendedFirmware;
  
  protected List<String> supportedUSBControllerList;
  
  protected String recommendedUSBController;
  
  protected Boolean supports3D;
  
  protected Boolean recommended3D;
  
  protected Boolean smcRecommended;
  
  @XmlElement(name = "ich7mRecommended")
  protected Boolean ich7MRecommended;
  
  protected Boolean usbRecommended;
  
  protected String supportLevel;
  
  protected Boolean supportedForCreate;
  
  @XmlElement(name = "vRAMSizeInKB")
  protected IntOption vramSizeInKB;
  
  protected Integer numSupportedFloppyDevices;
  
  protected List<String> wakeOnLanEthernetCard;
  
  protected Boolean supportsPvscsiControllerForBoot;
  
  protected Boolean diskUuidEnabled;
  
  protected Boolean supportsHotPlugPCI;
  
  protected Boolean supportsSecureBoot;
  
  protected Boolean defaultSecureBoot;
  
  protected Boolean persistentMemorySupported;
  
  protected Long supportedMinPersistentMemoryMB;
  
  protected Long supportedMaxPersistentMemoryMB;
  
  protected Long recommendedPersistentMemoryMB;
  
  protected Boolean persistentMemoryHotAddSupported;
  
  protected Boolean persistentMemoryHotRemoveSupported;
  
  protected Boolean persistentMemoryColdGrowthSupported;
  
  protected Long persistentMemoryColdGrowthGranularityMB;
  
  protected Boolean persistentMemoryHotGrowthSupported;
  
  protected Long persistentMemoryHotGrowthGranularityMB;
  
  protected Integer numRecommendedPhysicalSockets;
  
  protected Integer numRecommendedCoresPerSocket;
  
  protected BoolOption vvtdSupported;
  
  protected BoolOption vbsSupported;
  
  protected BoolOption vsgxSupported;
  
  protected Boolean supportsTPM20;
  
  protected Boolean vwdtSupported;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getFamily() {
    return this.family;
  }
  
  public void setFamily(String paramString) {
    this.family = paramString;
  }
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String paramString) {
    this.fullName = paramString;
  }
  
  public int getSupportedMaxCPUs() {
    return this.supportedMaxCPUs;
  }
  
  public void setSupportedMaxCPUs(int paramInt) {
    this.supportedMaxCPUs = paramInt;
  }
  
  public Integer getNumSupportedPhysicalSockets() {
    return this.numSupportedPhysicalSockets;
  }
  
  public void setNumSupportedPhysicalSockets(Integer paramInteger) {
    this.numSupportedPhysicalSockets = paramInteger;
  }
  
  public Integer getNumSupportedCoresPerSocket() {
    return this.numSupportedCoresPerSocket;
  }
  
  public void setNumSupportedCoresPerSocket(Integer paramInteger) {
    this.numSupportedCoresPerSocket = paramInteger;
  }
  
  public int getSupportedMinMemMB() {
    return this.supportedMinMemMB;
  }
  
  public void setSupportedMinMemMB(int paramInt) {
    this.supportedMinMemMB = paramInt;
  }
  
  public int getSupportedMaxMemMB() {
    return this.supportedMaxMemMB;
  }
  
  public void setSupportedMaxMemMB(int paramInt) {
    this.supportedMaxMemMB = paramInt;
  }
  
  public int getRecommendedMemMB() {
    return this.recommendedMemMB;
  }
  
  public void setRecommendedMemMB(int paramInt) {
    this.recommendedMemMB = paramInt;
  }
  
  public int getRecommendedColorDepth() {
    return this.recommendedColorDepth;
  }
  
  public void setRecommendedColorDepth(int paramInt) {
    this.recommendedColorDepth = paramInt;
  }
  
  public List<String> getSupportedDiskControllerList() {
    if (this.supportedDiskControllerList == null)
      this.supportedDiskControllerList = new ArrayList<>(); 
    return this.supportedDiskControllerList;
  }
  
  public String getRecommendedSCSIController() {
    return this.recommendedSCSIController;
  }
  
  public void setRecommendedSCSIController(String paramString) {
    this.recommendedSCSIController = paramString;
  }
  
  public String getRecommendedDiskController() {
    return this.recommendedDiskController;
  }
  
  public void setRecommendedDiskController(String paramString) {
    this.recommendedDiskController = paramString;
  }
  
  public int getSupportedNumDisks() {
    return this.supportedNumDisks;
  }
  
  public void setSupportedNumDisks(int paramInt) {
    this.supportedNumDisks = paramInt;
  }
  
  public int getRecommendedDiskSizeMB() {
    return this.recommendedDiskSizeMB;
  }
  
  public void setRecommendedDiskSizeMB(int paramInt) {
    this.recommendedDiskSizeMB = paramInt;
  }
  
  public String getRecommendedCdromController() {
    return this.recommendedCdromController;
  }
  
  public void setRecommendedCdromController(String paramString) {
    this.recommendedCdromController = paramString;
  }
  
  public List<String> getSupportedEthernetCard() {
    if (this.supportedEthernetCard == null)
      this.supportedEthernetCard = new ArrayList<>(); 
    return this.supportedEthernetCard;
  }
  
  public String getRecommendedEthernetCard() {
    return this.recommendedEthernetCard;
  }
  
  public void setRecommendedEthernetCard(String paramString) {
    this.recommendedEthernetCard = paramString;
  }
  
  public Boolean isSupportsSlaveDisk() {
    return this.supportsSlaveDisk;
  }
  
  public void setSupportsSlaveDisk(Boolean paramBoolean) {
    this.supportsSlaveDisk = paramBoolean;
  }
  
  public List<HostCpuIdInfo> getCpuFeatureMask() {
    if (this.cpuFeatureMask == null)
      this.cpuFeatureMask = new ArrayList<>(); 
    return this.cpuFeatureMask;
  }
  
  public Boolean isSmcRequired() {
    return this.smcRequired;
  }
  
  public void setSmcRequired(Boolean paramBoolean) {
    this.smcRequired = paramBoolean;
  }
  
  public boolean isSupportsWakeOnLan() {
    return this.supportsWakeOnLan;
  }
  
  public void setSupportsWakeOnLan(boolean paramBoolean) {
    this.supportsWakeOnLan = paramBoolean;
  }
  
  public Boolean isSupportsVMI() {
    return this.supportsVMI;
  }
  
  public void setSupportsVMI(Boolean paramBoolean) {
    this.supportsVMI = paramBoolean;
  }
  
  public Boolean isSupportsMemoryHotAdd() {
    return this.supportsMemoryHotAdd;
  }
  
  public void setSupportsMemoryHotAdd(Boolean paramBoolean) {
    this.supportsMemoryHotAdd = paramBoolean;
  }
  
  public Boolean isSupportsCpuHotAdd() {
    return this.supportsCpuHotAdd;
  }
  
  public void setSupportsCpuHotAdd(Boolean paramBoolean) {
    this.supportsCpuHotAdd = paramBoolean;
  }
  
  public Boolean isSupportsCpuHotRemove() {
    return this.supportsCpuHotRemove;
  }
  
  public void setSupportsCpuHotRemove(Boolean paramBoolean) {
    this.supportsCpuHotRemove = paramBoolean;
  }
  
  public List<String> getSupportedFirmware() {
    if (this.supportedFirmware == null)
      this.supportedFirmware = new ArrayList<>(); 
    return this.supportedFirmware;
  }
  
  public String getRecommendedFirmware() {
    return this.recommendedFirmware;
  }
  
  public void setRecommendedFirmware(String paramString) {
    this.recommendedFirmware = paramString;
  }
  
  public List<String> getSupportedUSBControllerList() {
    if (this.supportedUSBControllerList == null)
      this.supportedUSBControllerList = new ArrayList<>(); 
    return this.supportedUSBControllerList;
  }
  
  public String getRecommendedUSBController() {
    return this.recommendedUSBController;
  }
  
  public void setRecommendedUSBController(String paramString) {
    this.recommendedUSBController = paramString;
  }
  
  public Boolean isSupports3D() {
    return this.supports3D;
  }
  
  public void setSupports3D(Boolean paramBoolean) {
    this.supports3D = paramBoolean;
  }
  
  public Boolean isRecommended3D() {
    return this.recommended3D;
  }
  
  public void setRecommended3D(Boolean paramBoolean) {
    this.recommended3D = paramBoolean;
  }
  
  public Boolean isSmcRecommended() {
    return this.smcRecommended;
  }
  
  public void setSmcRecommended(Boolean paramBoolean) {
    this.smcRecommended = paramBoolean;
  }
  
  public Boolean isIch7MRecommended() {
    return this.ich7MRecommended;
  }
  
  public void setIch7MRecommended(Boolean paramBoolean) {
    this.ich7MRecommended = paramBoolean;
  }
  
  public Boolean isUsbRecommended() {
    return this.usbRecommended;
  }
  
  public void setUsbRecommended(Boolean paramBoolean) {
    this.usbRecommended = paramBoolean;
  }
  
  public String getSupportLevel() {
    return this.supportLevel;
  }
  
  public void setSupportLevel(String paramString) {
    this.supportLevel = paramString;
  }
  
  public Boolean isSupportedForCreate() {
    return this.supportedForCreate;
  }
  
  public void setSupportedForCreate(Boolean paramBoolean) {
    this.supportedForCreate = paramBoolean;
  }
  
  public IntOption getVRAMSizeInKB() {
    return this.vramSizeInKB;
  }
  
  public void setVRAMSizeInKB(IntOption paramIntOption) {
    this.vramSizeInKB = paramIntOption;
  }
  
  public Integer getNumSupportedFloppyDevices() {
    return this.numSupportedFloppyDevices;
  }
  
  public void setNumSupportedFloppyDevices(Integer paramInteger) {
    this.numSupportedFloppyDevices = paramInteger;
  }
  
  public List<String> getWakeOnLanEthernetCard() {
    if (this.wakeOnLanEthernetCard == null)
      this.wakeOnLanEthernetCard = new ArrayList<>(); 
    return this.wakeOnLanEthernetCard;
  }
  
  public Boolean isSupportsPvscsiControllerForBoot() {
    return this.supportsPvscsiControllerForBoot;
  }
  
  public void setSupportsPvscsiControllerForBoot(Boolean paramBoolean) {
    this.supportsPvscsiControllerForBoot = paramBoolean;
  }
  
  public Boolean isDiskUuidEnabled() {
    return this.diskUuidEnabled;
  }
  
  public void setDiskUuidEnabled(Boolean paramBoolean) {
    this.diskUuidEnabled = paramBoolean;
  }
  
  public Boolean isSupportsHotPlugPCI() {
    return this.supportsHotPlugPCI;
  }
  
  public void setSupportsHotPlugPCI(Boolean paramBoolean) {
    this.supportsHotPlugPCI = paramBoolean;
  }
  
  public Boolean isSupportsSecureBoot() {
    return this.supportsSecureBoot;
  }
  
  public void setSupportsSecureBoot(Boolean paramBoolean) {
    this.supportsSecureBoot = paramBoolean;
  }
  
  public Boolean isDefaultSecureBoot() {
    return this.defaultSecureBoot;
  }
  
  public void setDefaultSecureBoot(Boolean paramBoolean) {
    this.defaultSecureBoot = paramBoolean;
  }
  
  public Boolean isPersistentMemorySupported() {
    return this.persistentMemorySupported;
  }
  
  public void setPersistentMemorySupported(Boolean paramBoolean) {
    this.persistentMemorySupported = paramBoolean;
  }
  
  public Long getSupportedMinPersistentMemoryMB() {
    return this.supportedMinPersistentMemoryMB;
  }
  
  public void setSupportedMinPersistentMemoryMB(Long paramLong) {
    this.supportedMinPersistentMemoryMB = paramLong;
  }
  
  public Long getSupportedMaxPersistentMemoryMB() {
    return this.supportedMaxPersistentMemoryMB;
  }
  
  public void setSupportedMaxPersistentMemoryMB(Long paramLong) {
    this.supportedMaxPersistentMemoryMB = paramLong;
  }
  
  public Long getRecommendedPersistentMemoryMB() {
    return this.recommendedPersistentMemoryMB;
  }
  
  public void setRecommendedPersistentMemoryMB(Long paramLong) {
    this.recommendedPersistentMemoryMB = paramLong;
  }
  
  public Boolean isPersistentMemoryHotAddSupported() {
    return this.persistentMemoryHotAddSupported;
  }
  
  public void setPersistentMemoryHotAddSupported(Boolean paramBoolean) {
    this.persistentMemoryHotAddSupported = paramBoolean;
  }
  
  public Boolean isPersistentMemoryHotRemoveSupported() {
    return this.persistentMemoryHotRemoveSupported;
  }
  
  public void setPersistentMemoryHotRemoveSupported(Boolean paramBoolean) {
    this.persistentMemoryHotRemoveSupported = paramBoolean;
  }
  
  public Boolean isPersistentMemoryColdGrowthSupported() {
    return this.persistentMemoryColdGrowthSupported;
  }
  
  public void setPersistentMemoryColdGrowthSupported(Boolean paramBoolean) {
    this.persistentMemoryColdGrowthSupported = paramBoolean;
  }
  
  public Long getPersistentMemoryColdGrowthGranularityMB() {
    return this.persistentMemoryColdGrowthGranularityMB;
  }
  
  public void setPersistentMemoryColdGrowthGranularityMB(Long paramLong) {
    this.persistentMemoryColdGrowthGranularityMB = paramLong;
  }
  
  public Boolean isPersistentMemoryHotGrowthSupported() {
    return this.persistentMemoryHotGrowthSupported;
  }
  
  public void setPersistentMemoryHotGrowthSupported(Boolean paramBoolean) {
    this.persistentMemoryHotGrowthSupported = paramBoolean;
  }
  
  public Long getPersistentMemoryHotGrowthGranularityMB() {
    return this.persistentMemoryHotGrowthGranularityMB;
  }
  
  public void setPersistentMemoryHotGrowthGranularityMB(Long paramLong) {
    this.persistentMemoryHotGrowthGranularityMB = paramLong;
  }
  
  public Integer getNumRecommendedPhysicalSockets() {
    return this.numRecommendedPhysicalSockets;
  }
  
  public void setNumRecommendedPhysicalSockets(Integer paramInteger) {
    this.numRecommendedPhysicalSockets = paramInteger;
  }
  
  public Integer getNumRecommendedCoresPerSocket() {
    return this.numRecommendedCoresPerSocket;
  }
  
  public void setNumRecommendedCoresPerSocket(Integer paramInteger) {
    this.numRecommendedCoresPerSocket = paramInteger;
  }
  
  public BoolOption getVvtdSupported() {
    return this.vvtdSupported;
  }
  
  public void setVvtdSupported(BoolOption paramBoolOption) {
    this.vvtdSupported = paramBoolOption;
  }
  
  public BoolOption getVbsSupported() {
    return this.vbsSupported;
  }
  
  public void setVbsSupported(BoolOption paramBoolOption) {
    this.vbsSupported = paramBoolOption;
  }
  
  public BoolOption getVsgxSupported() {
    return this.vsgxSupported;
  }
  
  public void setVsgxSupported(BoolOption paramBoolOption) {
    this.vsgxSupported = paramBoolOption;
  }
  
  public Boolean isSupportsTPM20() {
    return this.supportsTPM20;
  }
  
  public void setSupportsTPM20(Boolean paramBoolean) {
    this.supportsTPM20 = paramBoolean;
  }
  
  public Boolean isVwdtSupported() {
    return this.vwdtSupported;
  }
  
  public void setVwdtSupported(Boolean paramBoolean) {
    this.vwdtSupported = paramBoolean;
  }
}
