package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DiagnosticManagerLogDescriptor;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticManagerLogDescriptor", propOrder = {"key", "fileName", "creator", "format", "mimeType", "info"})
public class DiagnosticManagerLogDescriptor extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String fileName;
  
  @XmlElement(required = true)
  protected String creator;
  
  @XmlElement(required = true)
  protected String format;
  
  @XmlElement(required = true)
  protected String mimeType;
  
  @XmlElement(required = true)
  protected Description info;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(String paramString) {
    this.fileName = paramString;
  }
  
  public String getCreator() {
    return this.creator;
  }
  
  public void setCreator(String paramString) {
    this.creator = paramString;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
  
  public String getMimeType() {
    return this.mimeType;
  }
  
  public void setMimeType(String paramString) {
    this.mimeType = paramString;
  }
  
  public Description getInfo() {
    return this.info;
  }
  
  public void setInfo(Description paramDescription) {
    this.info = paramDescription;
  }
}
