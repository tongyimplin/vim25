package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.HostOvercommittedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterOvercommittedEvent")
@XmlSeeAlso({HostOvercommittedEvent.class})
public class ClusterOvercommittedEvent extends ClusterEvent {}
