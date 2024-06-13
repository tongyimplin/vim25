package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.PermissionEvent;
import com.vmware.vim25.RoleEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationEvent")
@XmlSeeAlso({RoleEvent.class, PermissionEvent.class})
public class AuthorizationEvent extends Event {}
