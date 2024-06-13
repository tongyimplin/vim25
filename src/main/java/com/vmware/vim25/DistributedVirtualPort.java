package com.vmware.vim25;

import com.vmware.vim25.DVPortConfigInfo;
import com.vmware.vim25.DVPortState;
import com.vmware.vim25.DistributedVirtualPort;
import com.vmware.vim25.DistributedVirtualSwitchPortConnectee;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPort", propOrder = {"key", "config", "dvsUuid", "portgroupKey", "proxyHost", "connectee", "conflict", "conflictPortKey", "state", "connectionCookie", "lastStatusChange", "hostLocalPort", "externalId", "segmentPortId"})
public class DistributedVirtualPort extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected DVPortConfigInfo config;
  
  @XmlElement(required = true)
  protected String dvsUuid;
  
  protected String portgroupKey;
  
  protected ManagedObjectReference proxyHost;
  
  protected DistributedVirtualSwitchPortConnectee connectee;
  
  protected boolean conflict;
  
  protected String conflictPortKey;
  
  protected DVPortState state;
  
  protected Integer connectionCookie;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastStatusChange;
  
  protected Boolean hostLocalPort;
  
  protected String externalId;
  
  protected String segmentPortId;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public DVPortConfigInfo getConfig() {
    return this.config;
  }
  
  public void setConfig(DVPortConfigInfo paramDVPortConfigInfo) {
    this.config = paramDVPortConfigInfo;
  }
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
  
  public String getPortgroupKey() {
    return this.portgroupKey;
  }
  
  public void setPortgroupKey(String paramString) {
    this.portgroupKey = paramString;
  }
  
  public ManagedObjectReference getProxyHost() {
    return this.proxyHost;
  }
  
  public void setProxyHost(ManagedObjectReference paramManagedObjectReference) {
    this.proxyHost = paramManagedObjectReference;
  }
  
  public DistributedVirtualSwitchPortConnectee getConnectee() {
    return this.connectee;
  }
  
  public void setConnectee(DistributedVirtualSwitchPortConnectee paramDistributedVirtualSwitchPortConnectee) {
    this.connectee = paramDistributedVirtualSwitchPortConnectee;
  }
  
  public boolean isConflict() {
    return this.conflict;
  }
  
  public void setConflict(boolean paramBoolean) {
    this.conflict = paramBoolean;
  }
  
  public String getConflictPortKey() {
    return this.conflictPortKey;
  }
  
  public void setConflictPortKey(String paramString) {
    this.conflictPortKey = paramString;
  }
  
  public DVPortState getState() {
    return this.state;
  }
  
  public void setState(DVPortState paramDVPortState) {
    this.state = paramDVPortState;
  }
  
  public Integer getConnectionCookie() {
    return this.connectionCookie;
  }
  
  public void setConnectionCookie(Integer paramInteger) {
    this.connectionCookie = paramInteger;
  }
  
  public XMLGregorianCalendar getLastStatusChange() {
    return this.lastStatusChange;
  }
  
  public void setLastStatusChange(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastStatusChange = paramXMLGregorianCalendar;
  }
  
  public Boolean isHostLocalPort() {
    return this.hostLocalPort;
  }
  
  public void setHostLocalPort(Boolean paramBoolean) {
    this.hostLocalPort = paramBoolean;
  }
  
  public String getExternalId() {
    return this.externalId;
  }
  
  public void setExternalId(String paramString) {
    this.externalId = paramString;
  }
  
  public String getSegmentPortId() {
    return this.segmentPortId;
  }
  
  public void setSegmentPortId(String paramString) {
    this.segmentPortId = paramString;
  }
}
