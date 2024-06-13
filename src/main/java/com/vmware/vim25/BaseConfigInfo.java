package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfo;
import com.vmware.vim25.BaseConfigInfoBackingInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ID;
import com.vmware.vim25.VStorageObjectConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfo", propOrder = {"id", "name", "createTime", "keepAfterDeleteVm", "relocationDisabled", "nativeSnapshotSupported", "changedBlockTrackingEnabled", "backing", "iofilter"})
@XmlSeeAlso({VStorageObjectConfigInfo.class})
public class BaseConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createTime;
  
  protected Boolean keepAfterDeleteVm;
  
  protected Boolean relocationDisabled;
  
  protected Boolean nativeSnapshotSupported;
  
  protected Boolean changedBlockTrackingEnabled;
  
  @XmlElement(required = true)
  protected BaseConfigInfoBackingInfo backing;
  
  protected List<String> iofilter;
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public XMLGregorianCalendar getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createTime = paramXMLGregorianCalendar;
  }
  
  public Boolean isKeepAfterDeleteVm() {
    return this.keepAfterDeleteVm;
  }
  
  public void setKeepAfterDeleteVm(Boolean paramBoolean) {
    this.keepAfterDeleteVm = paramBoolean;
  }
  
  public Boolean isRelocationDisabled() {
    return this.relocationDisabled;
  }
  
  public void setRelocationDisabled(Boolean paramBoolean) {
    this.relocationDisabled = paramBoolean;
  }
  
  public Boolean isNativeSnapshotSupported() {
    return this.nativeSnapshotSupported;
  }
  
  public void setNativeSnapshotSupported(Boolean paramBoolean) {
    this.nativeSnapshotSupported = paramBoolean;
  }
  
  public Boolean isChangedBlockTrackingEnabled() {
    return this.changedBlockTrackingEnabled;
  }
  
  public void setChangedBlockTrackingEnabled(Boolean paramBoolean) {
    this.changedBlockTrackingEnabled = paramBoolean;
  }
  
  public BaseConfigInfoBackingInfo getBacking() {
    return this.backing;
  }
  
  public void setBacking(BaseConfigInfoBackingInfo paramBaseConfigInfoBackingInfo) {
    this.backing = paramBaseConfigInfoBackingInfo;
  }
  
  public List<String> getIofilter() {
    if (this.iofilter == null)
      this.iofilter = new ArrayList<>(); 
    return this.iofilter;
  }
}
