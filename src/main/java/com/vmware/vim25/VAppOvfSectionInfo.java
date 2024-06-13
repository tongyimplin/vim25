package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppOvfSectionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppOvfSectionInfo", propOrder = {"key", "namespace", "type", "atEnvelopeLevel", "contents"})
public class VAppOvfSectionInfo extends DynamicData {
  protected Integer key;
  
  protected String namespace;
  
  protected String type;
  
  protected Boolean atEnvelopeLevel;
  
  protected String contents;
  
  public Integer getKey() {
    return this.key;
  }
  
  public void setKey(Integer paramInteger) {
    this.key = paramInteger;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public void setNamespace(String paramString) {
    this.namespace = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public Boolean isAtEnvelopeLevel() {
    return this.atEnvelopeLevel;
  }
  
  public void setAtEnvelopeLevel(Boolean paramBoolean) {
    this.atEnvelopeLevel = paramBoolean;
  }
  
  public String getContents() {
    return this.contents;
  }
  
  public void setContents(String paramString) {
    this.contents = paramString;
  }
}
