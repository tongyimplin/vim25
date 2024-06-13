package com.vmware.vim25;

import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AuthorizationEvent;
import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.ComputeResourceEventArgument;
import com.vmware.vim25.CustomFieldEvent;
import com.vmware.vim25.DVPortgroupEvent;
import com.vmware.vim25.DatacenterEvent;
import com.vmware.vim25.DatacenterEventArgument;
import com.vmware.vim25.DatastoreEvent;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsEventArgument;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.Event;
import com.vmware.vim25.EventEx;
import com.vmware.vim25.GeneralEvent;
import com.vmware.vim25.HealthStatusChangedEvent;
import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.HostInventoryUnreadableEvent;
import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.LicenseExpiredEvent;
import com.vmware.vim25.LockerMisconfiguredEvent;
import com.vmware.vim25.LockerReconfiguredEvent;
import com.vmware.vim25.NetworkEventArgument;
import com.vmware.vim25.NetworkRollbackEvent;
import com.vmware.vim25.ProfileEvent;
import com.vmware.vim25.ResourcePoolEvent;
import com.vmware.vim25.ScheduledTaskEvent;
import com.vmware.vim25.SessionEvent;
import com.vmware.vim25.TaskEvent;
import com.vmware.vim25.TemplateUpgradeEvent;
import com.vmware.vim25.UpgradeEvent;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {"key", "chainId", "createdTime", "userName", "datacenter", "computeResource", "host", "vm", "ds", "net", "dvs", "fullFormattedMessage", "changeTag"})
@XmlSeeAlso({EventEx.class, LockerMisconfiguredEvent.class, HostInventoryUnreadableEvent.class, TaskEvent.class, NetworkRollbackEvent.class, LockerReconfiguredEvent.class, DatacenterEvent.class, LicenseExpiredEvent.class, SessionEvent.class, DatastoreEvent.class, CustomFieldEvent.class, GeneralEvent.class, AuthorizationEvent.class, UpgradeEvent.class, TemplateUpgradeEvent.class, ClusterEvent.class, ScheduledTaskEvent.class, ProfileEvent.class, LicenseEvent.class, DVPortgroupEvent.class, HealthStatusChangedEvent.class, AlarmEvent.class, VmEvent.class, ResourcePoolEvent.class, DvsEvent.class, HostEvent.class})
public class Event extends DynamicData {
  protected int key;
  
  protected int chainId;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createdTime;
  
  @XmlElement(required = true)
  protected String userName;
  
  protected DatacenterEventArgument datacenter;
  
  protected ComputeResourceEventArgument computeResource;
  
  protected HostEventArgument host;
  
  protected VmEventArgument vm;
  
  protected DatastoreEventArgument ds;
  
  protected NetworkEventArgument net;
  
  protected DvsEventArgument dvs;
  
  protected String fullFormattedMessage;
  
  protected String changeTag;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public int getChainId() {
    return this.chainId;
  }
  
  public void setChainId(int paramInt) {
    this.chainId = paramInt;
  }
  
  public XMLGregorianCalendar getCreatedTime() {
    return this.createdTime;
  }
  
  public void setCreatedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createdTime = paramXMLGregorianCalendar;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public DatacenterEventArgument getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(DatacenterEventArgument paramDatacenterEventArgument) {
    this.datacenter = paramDatacenterEventArgument;
  }
  
  public ComputeResourceEventArgument getComputeResource() {
    return this.computeResource;
  }
  
  public void setComputeResource(ComputeResourceEventArgument paramComputeResourceEventArgument) {
    this.computeResource = paramComputeResourceEventArgument;
  }
  
  public HostEventArgument getHost() {
    return this.host;
  }
  
  public void setHost(HostEventArgument paramHostEventArgument) {
    this.host = paramHostEventArgument;
  }
  
  public VmEventArgument getVm() {
    return this.vm;
  }
  
  public void setVm(VmEventArgument paramVmEventArgument) {
    this.vm = paramVmEventArgument;
  }
  
  public DatastoreEventArgument getDs() {
    return this.ds;
  }
  
  public void setDs(DatastoreEventArgument paramDatastoreEventArgument) {
    this.ds = paramDatastoreEventArgument;
  }
  
  public NetworkEventArgument getNet() {
    return this.net;
  }
  
  public void setNet(NetworkEventArgument paramNetworkEventArgument) {
    this.net = paramNetworkEventArgument;
  }
  
  public DvsEventArgument getDvs() {
    return this.dvs;
  }
  
  public void setDvs(DvsEventArgument paramDvsEventArgument) {
    this.dvs = paramDvsEventArgument;
  }
  
  public String getFullFormattedMessage() {
    return this.fullFormattedMessage;
  }
  
  public void setFullFormattedMessage(String paramString) {
    this.fullFormattedMessage = paramString;
  }
  
  public String getChangeTag() {
    return this.changeTag;
  }
  
  public void setChangeTag(String paramString) {
    this.changeTag = paramString;
  }
}
