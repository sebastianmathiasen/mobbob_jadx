package com.unity3d.player;

final class t {
    private static boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = true;

    t() {
    }

    static void a() {
        a = true;
    }

    static void b() {
        a = false;
    }

    static boolean c() {
        return a;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.b = z;
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.d = z;
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.c = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return a && this.b && !this.d && !this.c;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.c;
    }

    public final String toString() {
        return super.toString();
    }
}