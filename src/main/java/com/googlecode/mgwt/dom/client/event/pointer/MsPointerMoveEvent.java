/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.dom.client.event.pointer;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native MsPointerMoveEvent event.
 */
public class MsPointerMoveEvent extends MsPointerEvent<MsPointerMoveHandler> {

  /**
   * Event type for MsPointerMoveEvent. Represents the meta-data associated with
   * this event.
   */
  private static final Type<MsPointerMoveHandler> TYPE = new Type<MsPointerMoveHandler>(
      MsPointerEvent.MSPOINTERMOVE, new MsPointerMoveEvent());

  /**
   * Gets the event type associated with MsPointerMoveEvent.
   *
   * @return the handler type
   */
  public static Type<MsPointerMoveHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire pointer down events.
   */
  protected MsPointerMoveEvent() {
  }

  @Override
  public final Type<MsPointerMoveHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MsPointerMoveHandler handler) {
    handler.onPointerMove(this);
  }

}
