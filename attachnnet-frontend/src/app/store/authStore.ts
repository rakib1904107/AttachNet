import { create } from "zustand";

interface User {
  uid?: number;
  sid?: string;
  name?: string;
  batch?: string;
  dept?: string;
  email?: string;
  role?: "teacher" | "student" | "admin";
  number?: string;
}

interface AuthState {
  user: User | null;
  isAuthenticated: boolean;
  token?: string | null;
}

interface AuthAction {
  setUser: (user: User) => void;
  logout: () => void;
  updateUserDetails: (details: Partial<User>) => void;
}

const initialState: AuthState = {
  user: null,
  isAuthenticated: false,
  token: null,
};
export const useAuthStore = create<AuthState & AuthAction>((set) => ({
  ...initialState,
  setUser: (user) => set({ user, isAuthenticated: true }),
  logout: () => set(initialState),
  updateUserDetails: (details) =>
    set((state) => ({
      user: state.user ? { ...state.user, ...details } : null,
    })),
}));