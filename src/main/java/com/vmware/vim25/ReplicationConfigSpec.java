package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ReplicationConfigSpec;
import com.vmware.vim25.ReplicationInfoDiskSettings;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationConfigSpec", propOrder = {"generation", "vmReplicationId", "destination", "port", "rpo", "quiesceGuestEnabled", "paused", "oppUpdatesEnabled", "netCompressionEnabled", "netEncryptionEnabled", "encryptionDestination", "encryptionPort", "remoteCertificateThumbprint", "disk"})
public class ReplicationConfigSpec extends DynamicData {
  protected long generation;
  
  @XmlElement(required = true)
  protected String vmReplicationId;
  
  @XmlElement(required = true)
  protected String destination;
  
  protected int port;
  
  protected long rpo;
  
  protected boolean quiesceGuestEnabled;
  
  protected boolean paused;
  
  protected boolean oppUpdatesEnabled;
  
  protected Boolean netCompressionEnabled;
  
  protected Boolean netEncryptionEnabled;
  
  protected String encryptionDestination;
  
  protected Integer encryptionPort;
  
  protected String remoteCertificateThumbprint;
  
  protected List<ReplicationInfoDiskSettings> disk;
  
  public long getGeneration() {
    return this.generation;
  }
  
  public void setGeneration(long paramLong) {
    this.generation = paramLong;
  }
  
  public String getVmReplicationId() {
    return this.vmReplicationId;
  }
  
  public void setVmReplicationId(String paramString) {
    this.vmReplicationId = paramString;
  }
  
  public String getDestination() {
    return this.destination;
  }
  
  public void setDestination(String paramString) {
    this.destination = paramString;
  }
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public long getRpo() {
    return this.rpo;
  }
  
  public void setRpo(long paramLong) {
    this.rpo = paramLong;
  }
  
  public boolean isQuiesceGuestEnabled() {
    return this.quiesceGuestEnabled;
  }
  
  public void setQuiesceGuestEnabled(boolean paramBoolean) {
    this.quiesceGuestEnabled = paramBoolean;
  }
  
  public boolean isPaused() {
    return this.paused;
  }
  
  public void setPaused(boolean paramBoolean) {
    this.paused = paramBoolean;
  }
  
  public boolean isOppUpdatesEnabled() {
    return this.oppUpdatesEnabled;
  }
  
  public void setOppUpdatesEnabled(boolean paramBoolean) {
    this.oppUpdatesEnabled = paramBoolean;
  }
  
  public Boolean isNetCompressionEnabled() {
    return this.netCompressionEnabled;
  }
  
  public void setNetCompressionEnabled(Boolean paramBoolean) {
    this.netCompressionEnabled = paramBoolean;
  }
  
  public Boolean isNetEncryptionEnabled() {
    return this.netEncryptionEnabled;
  }
  
  public void setNetEncryptionEnabled(Boolean paramBoolean) {
    this.netEncryptionEnabled = paramBoolean;
  }
  
  public String getEncryptionDestination() {
    return this.encryptionDestination;
  }
  
  public void setEncryptionDestination(String paramString) {
    this.encryptionDestination = paramString;
  }
  
  public Integer getEncryptionPort() {
    return this.encryptionPort;
  }
  
  public void setEncryptionPort(Integer paramInteger) {
    this.encryptionPort = paramInteger;
  }
  
  public String getRemoteCertificateThumbprint() {
    return this.remoteCertificateThumbprint;
  }
  
  public void setRemoteCertificateThumbprint(String paramString) {
    this.remoteCertificateThumbprint = paramString;
  }
  
  public List<ReplicationInfoDiskSettings> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
}
