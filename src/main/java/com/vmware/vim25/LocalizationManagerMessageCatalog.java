package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizationManagerMessageCatalog;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizationManagerMessageCatalog", propOrder = {"moduleName", "catalogName", "locale", "catalogUri", "lastModified", "md5Sum", "version"})
public class LocalizationManagerMessageCatalog extends DynamicData {
  @XmlElement(required = true)
  protected String moduleName;
  
  @XmlElement(required = true)
  protected String catalogName;
  
  @XmlElement(required = true)
  protected String locale;
  
  @XmlElement(required = true)
  protected String catalogUri;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastModified;
  
  @XmlElement(name = "md5sum")
  protected String md5Sum;
  
  protected String version;
  
  public String getModuleName() {
    return this.moduleName;
  }
  
  public void setModuleName(String paramString) {
    this.moduleName = paramString;
  }
  
  public String getCatalogName() {
    return this.catalogName;
  }
  
  public void setCatalogName(String paramString) {
    this.catalogName = paramString;
  }
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
  
  public String getCatalogUri() {
    return this.catalogUri;
  }
  
  public void setCatalogUri(String paramString) {
    this.catalogUri = paramString;
  }
  
  public XMLGregorianCalendar getLastModified() {
    return this.lastModified;
  }
  
  public void setLastModified(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastModified = paramXMLGregorianCalendar;
  }
  
  public String getMd5Sum() {
    return this.md5Sum;
  }
  
  public void setMd5Sum(String paramString) {
    this.md5Sum = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
