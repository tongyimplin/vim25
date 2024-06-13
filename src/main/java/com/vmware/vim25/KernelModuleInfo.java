package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KernelModuleInfo;
import com.vmware.vim25.KernelModuleSectionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KernelModuleInfo", propOrder = {"id", "name", "version", "filename", "optionString", "loaded", "enabled", "useCount", "readOnlySection", "writableSection", "textSection", "dataSection", "bssSection"})
public class KernelModuleInfo extends DynamicData {
  protected int id;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String filename;
  
  @XmlElement(required = true)
  protected String optionString;
  
  protected boolean loaded;
  
  protected boolean enabled;
  
  protected int useCount;
  
  @XmlElement(required = true)
  protected KernelModuleSectionInfo readOnlySection;
  
  @XmlElement(required = true)
  protected KernelModuleSectionInfo writableSection;
  
  @XmlElement(required = true)
  protected KernelModuleSectionInfo textSection;
  
  @XmlElement(required = true)
  protected KernelModuleSectionInfo dataSection;
  
  @XmlElement(required = true)
  protected KernelModuleSectionInfo bssSection;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getFilename() {
    return this.filename;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
  
  public String getOptionString() {
    return this.optionString;
  }
  
  public void setOptionString(String paramString) {
    this.optionString = paramString;
  }
  
  public boolean isLoaded() {
    return this.loaded;
  }
  
  public void setLoaded(boolean paramBoolean) {
    this.loaded = paramBoolean;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public int getUseCount() {
    return this.useCount;
  }
  
  public void setUseCount(int paramInt) {
    this.useCount = paramInt;
  }
  
  public KernelModuleSectionInfo getReadOnlySection() {
    return this.readOnlySection;
  }
  
  public void setReadOnlySection(KernelModuleSectionInfo paramKernelModuleSectionInfo) {
    this.readOnlySection = paramKernelModuleSectionInfo;
  }
  
  public KernelModuleSectionInfo getWritableSection() {
    return this.writableSection;
  }
  
  public void setWritableSection(KernelModuleSectionInfo paramKernelModuleSectionInfo) {
    this.writableSection = paramKernelModuleSectionInfo;
  }
  
  public KernelModuleSectionInfo getTextSection() {
    return this.textSection;
  }
  
  public void setTextSection(KernelModuleSectionInfo paramKernelModuleSectionInfo) {
    this.textSection = paramKernelModuleSectionInfo;
  }
  
  public KernelModuleSectionInfo getDataSection() {
    return this.dataSection;
  }
  
  public void setDataSection(KernelModuleSectionInfo paramKernelModuleSectionInfo) {
    this.dataSection = paramKernelModuleSectionInfo;
  }
  
  public KernelModuleSectionInfo getBssSection() {
    return this.bssSection;
  }
  
  public void setBssSection(KernelModuleSectionInfo paramKernelModuleSectionInfo) {
    this.bssSection = paramKernelModuleSectionInfo;
  }
}
