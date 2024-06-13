package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TaskReason;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfo", propOrder = {"key", "task", "description", "name", "descriptionId", "entity", "entityName", "locked", "state", "cancelled", "cancelable", "error", "result", "progress", "reason", "queueTime", "startTime", "completeTime", "eventChainId", "changeTag", "parentTaskKey", "rootTaskKey", "activationId"})
public class TaskInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected ManagedObjectReference task;
  
  protected LocalizableMessage description;
  
  protected String name;
  
  @XmlElement(required = true)
  protected String descriptionId;
  
  protected ManagedObjectReference entity;
  
  protected String entityName;
  
  protected List<ManagedObjectReference> locked;
  
  @XmlElement(required = true)
  protected TaskInfoState state;
  
  protected boolean cancelled;
  
  protected boolean cancelable;
  
  protected LocalizedMethodFault error;
  
  protected Object result;
  
  protected Integer progress;
  
  @XmlElement(required = true)
  protected TaskReason reason;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar queueTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar completeTime;
  
  protected int eventChainId;
  
  protected String changeTag;
  
  protected String parentTaskKey;
  
  protected String rootTaskKey;
  
  protected String activationId;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ManagedObjectReference getTask() {
    return this.task;
  }
  
  public void setTask(ManagedObjectReference paramManagedObjectReference) {
    this.task = paramManagedObjectReference;
  }
  
  public LocalizableMessage getDescription() {
    return this.description;
  }
  
  public void setDescription(LocalizableMessage paramLocalizableMessage) {
    this.description = paramLocalizableMessage;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescriptionId() {
    return this.descriptionId;
  }
  
  public void setDescriptionId(String paramString) {
    this.descriptionId = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public List<ManagedObjectReference> getLocked() {
    if (this.locked == null)
      this.locked = new ArrayList<>(); 
    return this.locked;
  }
  
  public TaskInfoState getState() {
    return this.state;
  }
  
  public void setState(TaskInfoState paramTaskInfoState) {
    this.state = paramTaskInfoState;
  }
  
  public boolean isCancelled() {
    return this.cancelled;
  }
  
  public void setCancelled(boolean paramBoolean) {
    this.cancelled = paramBoolean;
  }
  
  public boolean isCancelable() {
    return this.cancelable;
  }
  
  public void setCancelable(boolean paramBoolean) {
    this.cancelable = paramBoolean;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
  
  public Object getResult() {
    return this.result;
  }
  
  public void setResult(Object paramObject) {
    this.result = paramObject;
  }
  
  public Integer getProgress() {
    return this.progress;
  }
  
  public void setProgress(Integer paramInteger) {
    this.progress = paramInteger;
  }
  
  public TaskReason getReason() {
    return this.reason;
  }
  
  public void setReason(TaskReason paramTaskReason) {
    this.reason = paramTaskReason;
  }
  
  public XMLGregorianCalendar getQueueTime() {
    return this.queueTime;
  }
  
  public void setQueueTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.queueTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.startTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getCompleteTime() {
    return this.completeTime;
  }
  
  public void setCompleteTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.completeTime = paramXMLGregorianCalendar;
  }
  
  public int getEventChainId() {
    return this.eventChainId;
  }
  
  public void setEventChainId(int paramInt) {
    this.eventChainId = paramInt;
  }
  
  public String getChangeTag() {
    return this.changeTag;
  }
  
  public void setChangeTag(String paramString) {
    this.changeTag = paramString;
  }
  
  public String getParentTaskKey() {
    return this.parentTaskKey;
  }
  
  public void setParentTaskKey(String paramString) {
    this.parentTaskKey = paramString;
  }
  
  public String getRootTaskKey() {
    return this.rootTaskKey;
  }
  
  public void setRootTaskKey(String paramString) {
    this.rootTaskKey = paramString;
  }
  
  public String getActivationId() {
    return this.activationId;
  }
  
  public void setActivationId(String paramString) {
    this.activationId = paramString;
  }
}
